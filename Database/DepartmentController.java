package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 * Class used to interact with the Department table and linkers that associate with it.
 * @author Andrei Tihoan
 */
public class DepartmentController {

	/**
	 * Function that, when given a code and a name, inserts a department into the Departments table
	 * 
	 * @param code
	 * @param name
	 * @return boolean The returned value specifies wether the insert was successful or not
	 */
    public static boolean addDepartment(String code, String name) {
	    
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		//The try block that closes the connection,PreparedStatenebt and ResultSet if there's a runtime error.
		try {
	        con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team045", "team045", "09fa15e9");
	        
	        //Checks if the department is already in the table
	        pstmt = con.prepareStatement("SELECT COUNT(*) FROM Department WHERE departmentCode = ?;");
	        pstmt.setString(1, code);
	        res = pstmt.executeQuery();
	        res.next();
	        //If it's already in the table
	        if(res.getInt(1)!=0)
	        	return false;
	        
	        pstmt.close();
	        //Otherwise inserts the department into the table
	        pstmt = con.prepareStatement("INSERT INTO Department (departmentCode,departmentName) VALUES (?,?);");
	        pstmt.setString(1, code);
	        pstmt.setString(2, name);
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
    /**
     * Function that returns a list of the departments in the Department table
     * @return List<Department> list of all the departments in the department table
     */
    public static List<Department> getDepartments() {
    	
    	Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		List<Department> l = new ArrayList<>();// ArrayList whose index represents a row in the Department table
		
		//The try block that closes the connection,PreparedStatement and ResultSet if there's a runtime error.
		try {
	        con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team045", "team045", "09fa15e9");
	        
	        //Queries the Department table for a resultSet of all the departments.
	        pstmt = con.prepareStatement("SELECT * FROM Department;");
	        res = pstmt.executeQuery();
	        
	        //Iterate over all rows in the Department table
	       	while (res.next()){
	       		String departmentCode = res.getString("departmentCode");
	       		String departmentName = res.getString("departmentName");
        		l.add(new Department(departmentCode,departmentName));
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
    /**
     * Function described by what it returns.
     * 
     * @return String[] Returns an array of strings, that represent the the names of all the departments in the Department table
     */
    public static String[] getDepartmentNames(){
    	
    	List<Department> l = getDepartments();
    	String[] depArray = new String[l.size()];
    	//counter
    	int c= 0;
    	for(Department d : l) {
    		depArray[c] = d.departmentName;
    		c++;
    	}
    	return depArray;
    }
    public static void main(String args[]) {
    	
    	addDepartment("COM","Computer Science");
    	addDepartment("PSY","Psychology");
    	
    }
}
