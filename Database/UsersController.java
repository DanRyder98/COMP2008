package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Class that interacts with the Users table and any linker table associated with it.
 */
public class UsersController {

/**
 * Function that takes an id, username, password and role and inserts a row with those values into the Users Table.
 * Checking to see if the username is unique. If there is any issue that stops the insert, the function returns false.
 * Could update to throw exceptions instead of return a boolean, that explain the error: UsernameNotUniqueException, IdNotUnique, SQLException; 
 * 
 * @param id -Id of user. E.g. Student - registrationNumber
 * @param username
 * @param password
 * @param role Has to be one of 4 values. Otherwise an SQLException is thrown: 'Admin','Registrar','Teacher','Student'
 * @return boolean -Returns true if the insert worked. False if it didn't for one of 2 reasons. Username not unique or SQLException
 * 
 * @author Andrei Tihoan
 * @version 1.0
 * @since 12-01-2018
 */
public static boolean addAccount(int id,String username, String password, String role) {
	
    	Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		//The try block that closes the Connection, PreparedStatement and ResultSet  if there's a runtime error.
		try {
	        con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team045", "team045", "09fa15e9");
	        
	        //Check if the username is unique
	        pstmt = con.prepareStatement("SELECT COUNT(*) FROM Users WHERE username = ?");
	        //Set value of ? placeholders
	        pstmt.setString(1, username);
	        //Fire the PreparedStatement
	        res = pstmt.executeQuery();
	        res.next();
	        //Check if there's any row with that username
	        if(res.getInt(1)!=0)
	        	return false;
	        pstmt.close();
	        res.close();
	        
	        //Check if the student id is unique
	        pstmt = con.prepareStatement("SELECT COUNT(*) FROM Users WHERE id = ?");
	        //Set value of ? placeholders
	        pstmt.setInt(1, id);
	        //Fire the PreparedStatement
	        res = pstmt.executeQuery();
	        res.next();
	        //Check if there's any row with that id
	        if(res.getInt(1)!=0)
	        	return false;
	        
	        pstmt.close();
	        //Insert the account into the Users table
	        pstmt = con.prepareStatement("INSERT INTO Users (id,username,password,role) VALUES (?,?,?,?)");
	        //Set value of ? placeholders
	        pstmt.setInt(1, id);
	        pstmt.setString(2, username);
	        pstmt.setString(3, password);
	        pstmt.setString(4, role);
	        //Fire the PreparedStatement
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

}
