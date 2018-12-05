package database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentController {

public static boolean addStudent(String registrationNumber,String surname, String forename, String title, String degreeName, String universityEmail, String personalTutor) {
	    
		Connection con = null;
		PreparedStatement pstmtI = null; // Used for an insert
		PreparedStatement pstmtQ = null; // Used for a query
		ResultSet res = null;
		//The try block that closes the connection, PreparedStatement and ResultSet if there's a runtime error.
		try {
	        con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team045", "team045", "09fa15e9");	       
	        pstmtI = con.prepareStatement("INSERT INTO Student (registrationNumber,surname,forename,title,degreeName,universityEmail,personalTutor) "+
	                                     "VALUES (?,?,?,?,?,?,?)");
	        pstmtQ = con.prepareStatement("SELECT COUNT(*) FROM Student WHERE registrationNumber = ?");
	        pstmtQ.setString(1, registrationNumber);
	        res = pstmtQ.executeQuery();
	        res.next();
	        //If student is already in the table
	        if(res.getInt(1) != 0)
	        	return false;
	        else {//Otherwise insert it into the table
	        	pstmtI.setString(1, registrationNumber);
	        	pstmtI.setString(2, surname);
	        	pstmtI.setString(3, forename);
	        	pstmtI.setString(4, title);
	        	pstmtI.setString(5, degreeName);
	        	pstmtI.setString(6, universityEmail);
	        	pstmtI.setString(7, personalTutor);
	        	pstmtI.executeUpdate();
	        	//Initialize the periodOfStudy for this student
	        	pstmtI.close();
	        	pstmtI = con.prepareStatement("INSERT INTO PeriodOfStudy (label,registrationNumber,level) VALUES (?,?,?)");
	        	pstmtI.setString(1, "A");
	        	pstmtI.setString(2, registrationNumber);
	        	pstmtI.setString(3, "1");
	        	pstmtI.executeUpdate();
	        	//Transfer core modules from their degree to their grades table
	        	StudentController.initializeCoreModules(registrationNumber);
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
			
			if(pstmtI!=null) 
				try {
				pstmtI.close();
				}
				catch (SQLException ex) {
					ex.printStackTrace();
				}
			if(pstmtQ!=null) 
				try {
				pstmtQ.close();
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
 * @return String - Represents the latest periodOfStudy of a Student
 */
public static String maxPeriod(String registrationNumber) {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet res = null;
	String maxLabel = "";
	//The try block that closes the connection, PreparedStatement and ResultSet if there's a runtime error.
	try {
        con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team045", "team045", "09fa15e9");	       
        pstmt = con.prepareStatement("SELECT MAX(label) FROM PeriodOfStudy WHERE registrationNumber = ?;");
        pstmt.setString(1, registrationNumber);
        res = pstmt.executeQuery();
        res.next();       
        maxLabel = res.getString("MAX(label)");
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
	return maxLabel;
}
    public static List<Module> showSelectedModulesOfStudent(String registrationNumber){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		List<Module> modules = new ArrayList<>();
		//The try block that closes the connection, PreparedStatement and ResultSet if there's a runtime error.
		try {
	        con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team045", "team045", "09fa15e9");	       
	        pstmt = con.prepareStatement("SELECT Grade.moduleName, Module.moduleCode, Module.credits FROM Grade,Module "+
	                                         "WHERE Grade.moduleName = Module.moduleName AND Grade.registrationNumber = ? AND Grade.label = ? "+
	        		                         " AND Grade.initialGrade = NULL AND Grade.resitGrade = NULL;");
	        String label = StudentController.maxPeriod(registrationNumber);
	        System.out.println(label);
	        pstmt.setString(1, registrationNumber);
	        pstmt.setString(2, label);
	        res = pstmt.executeQuery();
	        
	        while(res.next()){
	        	String moduleName = res.getString("moduleName");
	        	String moduleCode = res.getString("moduleCode");
	        	int credits = res.getInt("credits");
	        	modules.add(new Module(moduleCode,moduleName,credits));
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
		return modules;   	
    }
public static boolean removeStudent(String registrationNumber) {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet res = null;
	//The try block that closes the connection, PreparedStatement and ResultSet if there's a runtime error.
	try {
        con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team045", "team045", "09fa15e9");	       
        pstmt = con.prepareStatement("DELETE FROM Student Where registrationNumber = ?");
        pstmt.setString(1, registrationNumber);
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
 * Adds core modules of a level of a degree to the Grades table of a Student. Automatically looks for the most recent periodOfStudy/level the student is on.
 * Careful: The function runs on the assumption that the maximum level of the student in the current PeriodOfStudy table is the level at which
 * his core modules will be added. Do not use before deciding the current maximum level of the student.
 * @param registrationNumber identifies Student
 * @return boolean True if it was a success. False if otherwise.
 */
    public static boolean initializeCoreModules(String registrationNumber) {
		Connection con = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmtI = null; //Used to insert all the core modules into the Grade table
		ResultSet res = null;
		//The try block that closes the connection, PreparedStatement and ResultSet if there's a runtime error.
		try {
	        con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team045", "team045", "09fa15e9");
	        //look for the student's most recent periodOfStudy and then level
	        pstmt = con.prepareStatement("SELECT label,level FROM PeriodOfStudy WHERE registrationNumber = ? "+
	                                     " AND label = (SELECT MAX(label) FROM PeriodOfStudy WHERE registrationNumber = ?);");
	        pstmt.setString(1, registrationNumber);
	        pstmt.setString(2, registrationNumber);
	        res = pstmt.executeQuery();
	        res.next();
	        //Student's max level and periodOfStudyLabel associated with it
	        String maxLevel = res.getString("level");
	        String maxLabel = res.getString("label");
	        
	        res.close();
	        pstmt.close();
	        //Look for the student's degree
	        pstmt = con.prepareStatement("SELECT degreeName FROM Student WHERE registrationNumber = ?");
	        pstmt.setString(1, registrationNumber);
	        res = pstmt.executeQuery();
	        res.next();
	        //Student's degreeName
	        String degreeName = res.getString("degreeName");
	        
	        res.close();
	        pstmt.close();
	        //Look for all the core modules of the level of that degree
	        pstmt = con.prepareStatement("SELECT moduleName FROM ModuleOfLevelOfDegree WHERE level = ? AND degreeName = ? AND isCore = TRUE;");
	        pstmt.setString(1, maxLevel);
	        pstmt.setString(2, degreeName);
	        res = pstmt.executeQuery();
	        //Iterate through each module and add to the Grades table of this Student	        
	        pstmtI = con.prepareStatement("INSERT INTO Grade (registrationNumber,label,moduleName) VALUES (?,?,?)");
	        
	        while (res.next()){
	        	
	        	String coreModuleName = res.getString("moduleName");
	        	pstmtI.setString(1, registrationNumber);
	        	pstmtI.setString(2, maxLabel);
	        	pstmtI.setString(3, coreModuleName);
	        	pstmtI.executeUpdate();
	        	pstmtI.clearParameters();
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
			if(pstmtI!=null) 
				try {
				pstmtI.close();
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
 * Gets all students from the Student table
 */
public static List<Student> getStudents() {
    
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet res = null;
	List<Student> l = new ArrayList<>();
	//The try block that closes the connection, PreparedStatement and ResultSet if there's a runtime error.
	try {
        con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team045", "team045", "09fa15e9");	       
        pstmt = con.prepareStatement("SELECT * FROM Student");
       	res = pstmt.executeQuery();
       	
       	while(res.next()) {
       		String surname = res.getString("surname");
       		String forename = res.getString("forename");
       		String registrationNumber = res.getString("registrationNumber");
       		String title = res.getString("title");
       		String degreeName = res.getString("degreeName");
       		String universityEmail = res.getString("universityEmail");
       		String personalTutor = res.getString("personalTutor");
       		l.add(new Student(registrationNumber,surname,forename, title, degreeName,universityEmail, personalTutor));
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

    public static void main(String args[]) {
    	System.out.println(StudentController.addStudent("123456889", "Marwan","Daniel", "Mr", "Degree1", "abba@yahoo.com", "Jonathan"));
    	StudentController.showSelectedModulesOfStudent("123456889");
    }
}
