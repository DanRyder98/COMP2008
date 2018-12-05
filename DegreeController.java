package database;
/**
 * Class used to interact with the Degree table and all the linker tables that associate with it
 * @author Andrei Tihoan
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DegreeController {
	
	
    /**
     * Function that adds a degree and associates it with the given departments. Doubles up as an updateDegree function, since if used with
     * a degree that is already in the system, instead of giving an SQLException it further adds to that degree's associations.
     * If the degree already has a lead department, this function will shift the lead to the given leadDeps argument.
     * 
     * @param name
     * @param code
     * @param deps - List of Strings that represent the name of the departments the degree will associate to.
     * @param leadDeps - List of Strings that should hold a single value, that of the Association with 
     * @return
     */
	//TO DO: Introduce another parameter to addDegree: int maxLevel and boolean hasYearInIndustry. So that you can populate the LevelOfDegree table
    public static boolean addDegree(String name,String code,List<String> deps,List<String> leadDeps){
	    
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		//The try block that closes the connection, PreparedStatement and ResultSet if there's a runtime error.
		try {
	        con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team045", "team045", "09fa15e9");	       
	    
	        //If it's not already in the Degree table then insert
	        if(!isInDegreeTable(name)) {
	            //Add degree to the Degree table
	            pstmt = con.prepareStatement("INSERT INTO Degree (degreeName,degreeCode) VALUES (?,?);");
	            pstmt.setString(1, name);
	            pstmt.setString(2, code);
	            pstmt.executeUpdate();
	            pstmt.close();
	        }
	                 	        
	        //Adds all the associations between the degree and departments from deps
	        for(String s:deps) {
		        //Insert only if the association beteween the degree and this deperatment is NOT in the table
		        if(!isInDegreeOfDepartment(name,s)) {		        
		            //Insert degree-department association into the DegreeOfDepartment table
		            pstmt = con.prepareStatement("INSERT INTO DegreeOfDepartment (degreeName,departmentName,isLead) VALUES (?,?,?)");	        
	        	    pstmt.setString(1, name);
	        	    pstmt.setString(2, s);
	            	pstmt.setBoolean(3, false);
	        	    pstmt.executeUpdate();
	        	    pstmt.close();
	            }
	        }
	        //Checks if the degree already has a Lead department
	        pstmt = con.prepareStatement("SELECT departmentName FROM DegreeOfDepartment WHERE degreeName = ? AND isLead = TRUE;");
	        pstmt.setString(1, name);
	        res = pstmt.executeQuery();
	        
	        //If degree already has a lead department, change that relationship to a nonLead.
	        if(res.next()) {
	        	String leadDepartment = res.getString(1);
	        	pstmt.close();
	        	pstmt = con.prepareStatement("UPDATE DegreeOfDepartment SET isLead = FALSE WHERE departmentName = ? AND degreeName = ?;");
	        	pstmt.setString(1, leadDepartment);
	        	pstmt.setString(2, name);
	        	pstmt.executeUpdate();
	        }
	        res.close();
	        pstmt.close();
	        //Checks if the Lead Department-degree association is already in the table
	        //If it's already in the table, update to lead if it's not lead already, leave as is if it is lead.
	        if(isInDegreeOfDepartment(name,leadDeps.get(0))) {
	        	pstmt = con.prepareStatement("UPDATE DegreeOfDepartment SET isLead = TRUE WHERE departmentName = ? AND degreeName = ?;");
	        	pstmt.setString(1, leadDeps.get(0));
	        	pstmt.setString(2, name);
	        	pstmt.executeUpdate();
	        }
	        else {
	            //If it's not in the table, insert it as lead.
	            pstmt = con.prepareStatement("INSERT INTO DegreeOfDepartment (degreeName,departmentName,isLead) VALUES (?,?,?)");
	            pstmt.setString(1, name);
	            pstmt.setString(2, leadDeps.get(0));
	            pstmt.setBoolean(3, true);
	            pstmt.executeUpdate();
	        }
	       
	    }
	    catch(SQLException ex) {
	    	ex.printStackTrace();
	    	return false;
	    }
		finally{
			if(res!=null) 
				try {
				res.close();
				}
				catch (SQLException ex) {
					ex.printStackTrace();
				}
			
			if(pstmt!=null) 
				try {
				pstmt.close();
				}
				catch (SQLException ex) {
					ex.printStackTrace();
				}
			
			if(con!=null) 
				try {
				con.close();
				}
				catch (SQLException ex) {
					ex.printStackTrace();
				}
		}
		return true;
    }
    /**
     * Function that takes a degree name and returns a boolean telling us if the degree is or isn't in the Degree table.
     * @param degreeName
     * @param con - Connection to database
     * @return
     */
    public static boolean isInDegreeTable(String degreeName) {
    	Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		//Result is false because the IDE told me I had to initialize it. There's no other logic behind that.
		boolean result = false;
		//The try block that closes the connection, PreparedStatement and ResultSet if there's a runtime error.
		try {
			con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team045", "team045", "09fa15e9");
	        pstmt = con.prepareStatement("SELECT COUNT(*) FROM Degree WHERE degreeName = ?");
	        pstmt.setString(1, degreeName);
	        res = pstmt.executeQuery();
	        res.next();
	        //If there is a degree with this degreeName
	        if(res.getInt(1)!=0)
	        	result = true;
	        else// If there is no degree with this degreeName
	        	result = false;        	   
	    }
	    catch(SQLException ex) {
	    	ex.printStackTrace();
	    }
		finally{
			if(res!=null) 
				try {
				res.close();
				}
				catch (SQLException ex) {
					ex.printStackTrace();
				}
			
			if(pstmt!=null) 
				try {
				pstmt.close();
				}
				catch (SQLException ex) {
					ex.printStackTrace();
				}
			
			if(con!=null) 
				try {
				con.close();
				}
				catch (SQLException ex) {
					ex.printStackTrace();
				}
			
		}
		return result;
    	
    }
    /**
     * Function that checks if this degree - department association exists in the DegreeOfDepartments table
     * @param degreeName
     * @param departmentName
     * @return boolean - true if it exists, false otherwise
     */
    public static boolean isInDegreeOfDepartment(String degreeName,String departmentName) {
    	Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		//Result is false because the IDE told me I had to initialize it. There's no other logic behind that.
		boolean result = false;
		//The try block that closes the connection, PreparedStatement and ResultSet if there's a runtime error.
		try {
			con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team045", "team045", "09fa15e9");
	        pstmt = con.prepareStatement("SELECT COUNT(*) FROM DegreeOfDepartment WHERE degreeName = ? AND departmentName = ?");
	        pstmt.setString(1, degreeName);
	        pstmt.setString(2, departmentName);
	        res = pstmt.executeQuery();
	        res.next();
	        //If there is a degree with this degreeName -departmentName association
	        if(res.getInt(1)!=0)
	        	result = true;
	        else// If there is no degree with this degreeName
	        	result = false;        	   
	    }
	    catch(SQLException ex) {
	    	ex.printStackTrace();
	    }
		finally{
			if(res!=null) 
				try {
				res.close();
				}
				catch (SQLException ex) {
					ex.printStackTrace();
				}
			
			if(pstmt!=null) 
				try {
				pstmt.close();
				}
				catch (SQLException ex) {
					ex.printStackTrace();
				}
			
			if(con!=null) 
				try {
				con.close();
				}
				catch (SQLException ex) {
					ex.printStackTrace();
				}
			
		}
		return result;
    	
    }
    /**
     * Removes a degree from the Degree table
     * @param degreeName
     * @return
     */
    public static boolean removeDegree(String degreeName) {
    	Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		//The try block that closes the connection, PreparedStatement and ResultSet if there's a runtime error.
		try {
	        con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team045", "team045", "09fa15e9");	
	        
	        pstmt = con.prepareStatement("DELETE FROM Degree WHERE degreeName = ?");
	        pstmt.setString(1, degreeName);
	        pstmt.executeUpdate();
	        
	    }
	    catch(SQLException ex) {
	    	ex.printStackTrace();
	    	return false;
	    }
		finally{
			if(res!=null) 
				try {
				res.close();
				}
				catch (SQLException ex) {
					ex.printStackTrace();
				}
			
			if(pstmt!=null) 
				try {
				pstmt.close();
				}
				catch (SQLException ex) {
					ex.printStackTrace();
				}
			
			if(con!=null) 
				try {
				con.close();
				}
				catch (SQLException ex) {
					ex.printStackTrace();
				}
			
		}
		return true;

    }
    public static boolean removeDegreeDepartmentAssociation(String degreeName, List<String> departments) {
    	Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		//The try block that closes the connection, PreparedStatement and ResultSet if there's a runtime error.
		try {
	        con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team045", "team045", "09fa15e9");	       
	        pstmt = con.prepareStatement("DELETE FROM DegreeOfDepartment WHERE degreeName = ? AND departmentName = ?;");
	        
	        for(String departmentName:departments) {
	        	pstmt.setString(1, degreeName);
	        	pstmt.setString(2, departmentName);
	        	pstmt.executeUpdate();
	        	pstmt.clearParameters();
	        }
	        	   
	    }
	    catch(SQLException ex) {
	    	ex.printStackTrace();
	    	return false;
	    }
		finally{
			if(res!=null) 
				try {
				res.close();
				}
				catch (SQLException ex) {
					ex.printStackTrace();
				}
			
			if(pstmt!=null) 
				try {
				pstmt.close();
				}
				catch (SQLException ex) {
					ex.printStackTrace();
				}
			
			if(con!=null) 
				try {
				con.close();
				}
				catch (SQLException ex) {
					ex.printStackTrace();
				}	
		}	
		return true;
    }
    /**
     * 
     * @return List of all Degree objects from the degree table.
     */
    public static List<Degree> getDegrees(){
    	Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		List<Degree> l = new ArrayList<>();
		//The try block that closes the connection, PreparedStatement and ResultSet if there's a runtime error.
		try {
	        con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team045", "team045", "09fa15e9");	       
	        pstmt = con.prepareStatement("SELECT * FROM Degree;");
	        res = pstmt.executeQuery();
	        
	        while(res.next()) {
	        	String name = res.getString("degreeName");
	        	String code = res.getString("degreeCode");
	        	l.add(new Degree(code,name));
	        }	        
	        	   
	    }
	    catch(SQLException ex) {
	    	ex.printStackTrace();
	    }
		finally{
			if(res!=null) 
				try {
				res.close();
				}
				catch (SQLException ex) {
					ex.printStackTrace();
				}
			
			if(pstmt!=null) 
				try {
				pstmt.close();
				}
				catch (SQLException ex) {
					ex.printStackTrace();
				}
			
			if(con!=null) 
				try {
				con.close();
				}
				catch (SQLException ex) {
					ex.printStackTrace();
				}
			
		}
		return l;
    }
    public static String[] getDegreeNameAsString() {
    	List<Degree> l =getDegrees();
    	String[] arr = new String[l.size()];
    	int counter = 0;
    	for(Degree d:l) {
    		arr[counter] = d.degreeName;
    		counter ++;
    	}
    	return arr;
    }
    
    
    public static void main(String args[]) {
        String[] arr = getDegreeNameAsString();
    	for(String s:arr)
    		System.out.println(s);
    }
}
