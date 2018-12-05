package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
public static boolean addAccount(String id,String username, String password, String role) {
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
	        pstmt.setString(1, id);
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
	        pstmt.setString(1, id);
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
/**
 * Overloads addAccount. Used when the id is not specified. In the case of Admins, Registrars and Teachers
 * @param id
 * @param username
 * @param password
 * @param role
 * @return
 */
public static boolean addAccount(String username, String password, String role) {

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
        
        pstmt.close();
        //Insert the account into the Users table
        pstmt = con.prepareStatement("INSERT INTO Users (username,password,role) VALUES (?,?,?)");
        //Set value of ? placeholders
        pstmt.setString(1, username);
        pstmt.setString(2, password);
        pstmt.setString(3, role);
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
/**
 * Function that, when given an id, returns an user from the Users table that had that id.
 * 
 * @param id
 * @return boolean Tells if the removing of the account was successfull. Even if the account isn't in the database it still returns true. Could
 * Change that.
 */
    public static boolean removeAccount(String username) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		//The try block that closes the connection, PreparedStatement and ResultSet if there's a runtime error.
		try {
	        con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team045", "team045", "09fa15e9");	
	        
	        pstmt = con.prepareStatement("DELETE FROM Users WHERE username = ?");
	        pstmt.setString(1, username);
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
     * 
     * @return A list of all the users in the Users table
     */
    public static List<User> getUsers() {
    	
    	Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		List<User> l = new ArrayList<>();// ArrayList whose index represents a row in the Users table
		
		//The try block that closes the connection,PreparedStatement and ResultSet if there's a runtime error.
		try {
	        con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team045", "team045", "09fa15e9");
	        
	        //Queries the Users table for a ResultSet of all the users.
	        pstmt = con.prepareStatement("SELECT * FROM Users;");
	        res = pstmt.executeQuery();
	        
	        //Iterate over all rows in the Users table
	       	while (res.next()){
	       		int id = res.getInt("id");
	       		String username = res.getString("username");
	       		String password = res.getString("password");
	       		String role = res.getString("role");
        		l.add(new User(id,username,password,role));
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
     * 
     * @return An array of strings that contain each user id in the Users table
     */
    public static String[] getUserIdArray(){
    	
    	List<User> l = getUsers();
    	String[] userArray = new String[l.size()];
    	//counter
    	int c= 0;
    	for(User u : l) {
    		userArray[c] = u.id + "";
    		c++;
    	}
    	return userArray;
    }

}
