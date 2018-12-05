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
    	StudentController.addStudent("123456889", "Marwan","Daniel", "Mr", "Degree1", "abba@yahoo.com", "Jonathan");
    }
}
