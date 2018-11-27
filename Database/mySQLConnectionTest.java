import java.sql.*;
import java.util.*;
public class mySQLConnectionTest
{
 public static void main(String[] args) throws Exception 
	{
 System.out.println("\nDrivers loaded as properties:");
 System.out.println(System.getProperty("jdbc.drivers"));
 System.out.println("\nDrivers loaded by DriverManager:");
 Enumeration<Driver> list = DriverManager.getDrivers();
 while (list.hasMoreElements())
 System.out.println(list.nextElement());

Connection con = null;
        try 
		{
          con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team045", "team045", "09fa15e9");  
        }
        catch (SQLException ex) 
		{
            ex.printStackTrace();
        }
        finally 
		{
            if (con != null) con.close();
        }


        
    }
    
}


