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
	
	

    public static void addDegree(String name,String code,List<String> deps,List<String> leadDeps){
	    
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		//The try block that closes the connection, PreparedStatement and ResultSet if there's a runtime error.
		try {
	        con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team045", "team045", "09fa15e9");	       
	        pstmt = con.prepareStatement("SELECT * FROM Users");
	        
	        
	       	res = pstmt.executeQuery();
	        		
	       	List<List<Object>> r = new ArrayList<>();// ArrayList whose index represents a row in the table Test
	       	//Iterate over all rows in the Test table
	       	while (res.next()){
	       		int id = res.getInt("ID");
	       		String namez = res.getString("name");
	       		List<Object> c = new ArrayList<>(); // ArrayList who keeps the values of the columns of a row.
        		c.add(id);	
        		c.add(namez);
	       		r.add(c); // Ad this row to the ArrayList that keeps rows.
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
    }
}
