package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 * Class that interacts with the Module table and some linker tables associated with it
 * @author Andrei Tihoan
 * @since 12-03-2018
 */
public class ModuleController {

	/**
	 * Function that, when given all the attributes of the Module table adds a module into the table
	 * @param code
	 * @param name
	 * @param credits
	 * @param sessionOfStudy Can only be "Spring","Autumn","Year Long","Summer"
	 * @param departmentName
	 * @return boolean That represents wether or not the insert was successful
	 */
public static boolean addModule(String code, String name, int credits, String sessionOfStudy, String departmentName) {
	    
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		//The try block that closes the connection, PreparedStatement and ResultSet if there's a runtime error.
		try {
	        con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team045", "team045", "09fa15e9");
	        //Check if module is in the table
	        pstmt = con.prepareStatement("SELECT COUNT(*) FROM Module WHERE moduleName = ?");
	        pstmt.setString(1, name);
	        res = pstmt.executeQuery();
	        res.next();
	        //If the module is already in the table
	        if(res.getInt(1)!=0) {
	        	return false;
	        }
	        pstmt.close();
	        res.close();
	        //If it isn't, insert into the Module table;
	        pstmt = con.prepareStatement("INSERT INTO Module (moduleCode,moduleName,credits,sessionOfStudy,departmentName) "+
	                                                 "VALUES (?,?,?,?,?)");
	        pstmt.setString(1, code);
	        pstmt.setString(2, name);
	        pstmt.setInt(3, credits);
	        pstmt.setString(4, sessionOfStudy);
	        pstmt.setString(5, departmentName);
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
     * Function that associates a level of a degree with a list of core modules and a list of optional modules
     * @param moduleName
     * @param level
     * @param degreeName
     * @return
     */
    public static boolean addModulesToLevelOfDegree(String level, String degreeName, List<String> coreModuleName, List<String> optionalModuleName) {
		Connection con = null;
		PreparedStatement pstmtM = null; // used to insert module-(level-degree) association
		PreparedStatement pstmtQ = null; // used to make queries
		PreparedStatement pstmtU = null; // used for updating an association to core.
		ResultSet res = null;
		//The try block that closes the connection, PreparedStatement and ResultSet if there's a runtime error.
		try {
	        con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team045", "team045", "09fa15e9");
	        //Initialise preparedStatements
	        pstmtM = con.prepareStatement("INSERT INTO ModuleOfLevelOfDegree (degreeName,moduleName,level,isCore) VALUES (?,?,?,?)");
	        pstmtQ = con.prepareStatement("SELECT COUNT(*) FROM ModuleOfLevelOfDegree WHERE moduleName = ? AND degreeName = ? AND level = ?");
	        pstmtU = con.prepareStatement("UPDATE ModuleOfLevelOfDegree SET isCore = TRUE WHERE moduleName = ? AND degreeName = ? AND level = ?");
	        
	        //Insert all optional modules into the ModuleOfLevelOfDegree table if they're not already in there
	        for(String opModuleName : optionalModuleName) {
	        	//Check if this (level-degree) - module association is already in the table
	        	pstmtQ.setString(1, opModuleName);
	        	pstmtQ.setString(2, degreeName);
	        	pstmtQ.setString(3, level);
	        	res = pstmtQ.executeQuery();
	        	pstmtQ.clearParameters();
	        	res.next();
	        	//If this (level-degree) - module association is NOT already in the table
	        	if(res.getInt(1)==0) {
	        		//Insert the association into the table, else do nothing
	        		pstmtM.setString(1, degreeName);
	        		pstmtM.setString(2, opModuleName);
	        		pstmtM.setString(3, level);
	        		pstmtM.setBoolean(4, false);
	        		pstmtM.executeUpdate();
	        		pstmtM.clearParameters();
	        	}
        		res.close();
	        }
	      //Insert all core modules into the ModuleOfLevelOfDegree table if they're not already in there
	        for(String crModuleName : coreModuleName) {
	        	//Check if this (level-degree) - module association is already in the table
	        	pstmtQ.setString(1, crModuleName);
	        	pstmtQ.setString(2, degreeName);
	        	pstmtQ.setString(3, level);
	        	res = pstmtQ.executeQuery();
	        	pstmtQ.clearParameters();
	        	res.next();
	        	//If this (level-degree) - module association is NOT already in the table
	        	if(res.getInt(1)==0) {
	        		//Insert the association into the table
	        		pstmtM.setString(1, degreeName);
	        		pstmtM.setString(2, crModuleName);
	        		pstmtM.setString(3, level);
	        		pstmtM.setBoolean(4, true);
	        		pstmtM.executeUpdate();
	        		pstmtM.clearParameters();
	        		res.close();
	        	}
	        	else { // If the module association is already into the table, update to core if it's not core, leave as is, if it is.
	        		res.close();
	        		if(!isModuleOfLevelOfDegreeCore(level, degreeName, crModuleName)){
	        			//update association to core
	        			pstmtU.setString(1, crModuleName);
	        			pstmtU.setString(2, degreeName);
	        			pstmtU.setString(3, level);
	        			pstmtU.executeUpdate();
	        			pstmtU.clearParameters();
	        		}
	        	}
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
			
			if(pstmtM!=null) 
				try {
				pstmtM.close();
				}
				catch (SQLException ex) {
					ex.printStackTrace();
				}
			if(pstmtQ!=null) 
				try {
				pstmtM.close();
				}
				catch (SQLException ex) {
					ex.printStackTrace();
				}
			if(pstmtU!=null) 
				try {
				pstmtU.close();
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
     * Checks if this module - (level-degree) Association is core.
     * @param level
     * @param degreeName
     * @param ModuleName
     * @return boolean. True if it's core. False if it's either: 1. In the table but not core. 2. Not in the table.
     */
    public static boolean isModuleOfLevelOfDegreeCore(String level, String degreeName, String moduleName) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		//The try block that closes the connection, PreparedStatement and ResultSet if there's a runtime error.
		try {
	        con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team045", "team045", "09fa15e9");	       
	        pstmt = con.prepareStatement("SELECT moduleName FROM ModuleOfLevelOfDegree WHERE moduleName = ? AND degreeName = ? "+
	                                         " AND level = ? AND isCore = TRUE;");
	        pstmt.setString(1, moduleName);
	        pstmt.setString(2, degreeName);
	        pstmt.setString(3, level);
	        res = pstmt.executeQuery();

	        if(res.next())
	        	return true;
	        else
	        	return false;  
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
    }

    public static boolean removeModule(String moduleName) {
    	Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		//The try block that closes the connection, PreparedStatement and ResultSet if there's a runtime error.
		try {
	        con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team045", "team045", "09fa15e9");	       
	        pstmt = con.prepareStatement("DELETE FROM Module WHERE moduleName = ?");
	        pstmt.setString(1, moduleName);
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
    public static boolean removeModulesFromLevelOfDegree(List<String> modules, String level, String degreeName) {
    	Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		//The try block that closes the connection, PreparedStatement and ResultSet if there's a runtime error.
		try {
	        con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team045", "team045", "09fa15e9");	       
	        pstmt = con.prepareStatement("DELETE FROM ModuleOfLevelOfDegree WHERE moduleName = ? AND level = ? AND degreeName = ?;");
	        
	        //Iterates through the list of moduleNames and removes modules from the table
	        for(String mod : modules) {
	        	pstmt.setString(1, mod);
	        	pstmt.setString(2, level);
	        	pstmt.setString(3, degreeName);
	        	pstmt.executeUpdate();
	        	pstmt.clearParameters();
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
		return true;
    }
    //Let's think about associating a module with a Student;
    public static void main(String args[]) {
    	List<String> op = new ArrayList<>();
    	List<String> cr = new ArrayList<>();
    	ModuleController.addModule("COM2108", "Functional Programming", 10, "Autumn", "Computer Science");
    	ModuleController.addModule("COM2008", "System Design and Security", 20, "Autumn", "Computer Science");
    	ModuleController.addModule("COM2004", "Big data", 20, "Autumn", "Computer Science");
    	ModuleController.addModule("COM1002", "Foundations of Computer Science", 10, "Autumn", "Computer Science");
    	op.add("Functional Programming");
    	op.add("System Design and Security");
    	cr.add("Big data");
    	cr.add("Foundations of Computer Science");
    	addModulesToLevelOfDegree("2", "Degree1", cr, op);
    	//Remove bigData
    	List<String> modules = new ArrayList<>();
    	
    	
    }
}
