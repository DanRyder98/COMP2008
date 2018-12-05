// Class that initialises the database tables.
package database2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class InitTables {
	
	

public static void main(String args[])  throws SQLException {
	    
		Connection con = null;
		Statement stmt = null;
		ResultSet res = null;
		//The try block that closes the connection and statement if there's a runtime error.
		try {
	        con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team045", "team045", "09fa15e9");	       
	        stmt = con.createStatement();
	         
	        //Create Degree table
	        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Degree ( "+
                                   "degreeCode CHAR(7) NOT NULL,"+
                                   "degreeName VARCHAR(45) NOT NULL,"+
                                   "PRIMARY KEY (degreeName)) ENGINE = InnoDB;");
	        //Create Students table
	        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Student ( "+
	                               "registrationNumber VARCHAR(45) NOT NULL,"+
	        		               "surname VARCHAR(45) NOT NULL, "+
	                               "forename VARCHAR(45) NOT NULL, "+
	        		               "title ENUM('Mr','Ms','Other') NOT NULL,"+
	                               "degreeName VARCHAR(45), "+
	        		               "universityEmail VARCHAR(45) NOT NULL UNIQUE, "+
	                               "personalTutor VARCHAR(45) NOT NULL, "+
	        		               "PRIMARY KEY(registrationNumber),"+
	        		               "FOREIGN KEY(degreeName) REFERENCES Degree(degreeName) ON DELETE SET NULL) ENGINE = InnoDB;");
	      //Create Users table
	        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Users ( "+
                                   "id VARCHAR(45),"+
		                           "username VARCHAR(45) NOT NULL, "+
                                   "password VARCHAR(45) NOT NULL, "+
		                           "role ENUM('Administrator','Registrar','Teacher','Student') NOT NULL,"+
                                   "PRIMARY KEY(username), "+
		                           "FOREIGN KEY (id) REFERENCES Student(registrationNumber) ON DELETE CASCADE) ENGINE = InnoDB;");
	        //Create Department table
	        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Department ( "+
                                   "departmentCode CHAR(8) NOT NULL,"+
		                           "departmentName VARCHAR(45) NOT NULL, "+
		                           "PRIMARY KEY(departmentName)) ENGINE = InnoDB;");
	        //Create Module table
	        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Module ( "+
                                   "moduleCode CHAR(9) NOT NULL,"+
		                           "moduleName VARCHAR(45) NOT NULL, "+
                                   "credits INT(3) NOT NULL, "+
		                           "sessionOfStudy ENUM('Spring','Autumn','Year Long','Summer') NOT NULL,"+
                                   "departmentName VARCHAR(45),"+
		                           "PRIMARY KEY(moduleName),"+
                                   "FOREIGN KEY(departmentName) REFERENCES Department(departmentName) ON DELETE SET NULL) ENGINE = InnoDB;");
	        
	        //Create LevelOfStudy table.
	        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS LevelOfStudy ( "+
                                   "LOSlabel VARCHAR(2) NOT NULL,"+
		                           "name VARCHAR(45) NOT NULL, "+
		                           "PRIMARY KEY(LOSlabel)) ENGINE = InnoDB;");
	        //Create PeriodOfStudy table
	        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS PeriodOfStudy ( "+
                                   "registrationNumber VARCHAR(45) NOT NULL,"+
		                           "label VARCHAR(45) NOT NULL, "+
                                   "level VARCHAR(2) NOT NULL, "+
		                           "startDate DATE NOT NULL,"+
                                   "endDate DATE NOT NULL, "+
		                           "PRIMARY KEY(registrationNumber,label),"+
                                   "FOREIGN KEY(registrationNumber) REFERENCES Student(registrationNumber) ON DELETE CASCADE,"+
		                           "FOREIGN KEY(level) REFERENCES LevelOfStudy(LOSlabel)) ENGINE = InnoDB;");	        
	        
	        //Linker tables:       
	        //Create DegreeOfDepartment table.
	        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS DegreeOfDepartment ( "+
                                   "degreeName VARCHAR(45) NOT NULL,"+
                                   "departmentName VARCHAR(45) NOT NULL, "+
                                   "isLead BOOL NOT NULL, "+
                                   "PRIMARY KEY(degreeName,departmentName),"+
                                   "FOREIGN KEY(degreeName) REFERENCES Degree(degreeName) ON DELETE CASCADE, "+
                                   "FOREIGN KEY(departmentName) REFERENCES Department(departmentName) ON DELETE CASCADE) ENGINE = InnoDB;");
	        //Create LevelOfDegree table
	        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS LevelOfDegree ( "+
                                   "degreeName VARCHAR(45) NOT NULL,"+
                                   "level VARCHAR(2) NOT NULL, "+
                                   "PRIMARY KEY(degreeName,level),"+
                                   "FOREIGN KEY(degreeName) REFERENCES Degree(degreeName) ON DELETE CASCADE, "+
                                   "FOREIGN KEY(level) REFERENCES LevelOfStudy(LOSlabel)) ENGINE = InnoDB;");	 
	        //Create ModuleOfLevelOfDegree table. This stores the core and optional modules for each level of each degree.
	        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS ModuleOfLevelOfDegree ( "+
                                   "moduleName VARCHAR(45) NOT NULL,"+
                                   "level VARCHAR(2) NOT NULL, "+
                                   "degreeName VARCHAR(45) NOT NULL,"+ 
                                   "isCore BOOLEAN NOT NULL,"+
                                   "PRIMARY KEY(moduleName,level,degreeName),"+
                                   "FOREIGN KEY(moduleName) REFERENCES Module(moduleName) ON DELETE CASCADE, "+
                                   "FOREIGN KEY(degreeName,level) REFERENCES LevelOfDegree(degreeName,level) ON DELETE CASCADE) ENGINE = InnoDB;");
	        /*//Create ModuleOfStudent table. Represents a relationship between a student and a module. Used by the registrar to add optional modules to a student.
	        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS ModuleOfStudent ( "+
	                               "registrationNumber VARCHAR(45) NOT NULL, "+
	        		               "moduleName VARCHAR(45) NOT NULL, "+
	                               "level VARCHAR(2) NOT NULL, "+
	        		               "isCore BOOL NOT NULL," +
	        		               "PRIMARY KEY (registrationNumber,moduleName), "+
	                               "FOREIGN KEY (moduleName) REFERENCES Module(moduleName) ON DELETE CASCADE, "+
	        		               "FOREIGN KEY (registrationNumber) REFERENCES Student(registrationNumber) ON DELETE CASCADE, "+
	                               "FOREIGN KEY (level) REFERENCES LevelOfStudy(LOSlabel)) ENGINE = InnoDB;");
	        */
	        //Create Grades table (Represents a relationship between a period of study and a moduleOfStudent.)
	        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Grade ( "+
                                   "registrationNumber VARCHAR(45) NOT NULL,"+
	        		               "label VARCHAR(45) NOT NULL,"+
                                   "moduleName VARCHAR(45) NOT NULL, "+
	        		               "initialGrade FLOAT(4,2), "+
                                   "resitGrade FLOAT(4,2), "+
                                   "PRIMARY KEY(registrationNumber,label,moduleName),"+
                                   "FOREIGN KEY(registrationNumber,label) REFERENCES PeriodOfStudy(registrationNumber,label) ON DELETE CASCADE, "+
                                   "FOREIGN KEY(moduleName) REFERENCES Module(moduleName) ON DELETE CASCADE) ENGINE = InnoDB");
	        		               
	        // --------------------------------------------------------------------------------------------------------------
	        // Initializing basic values into tables. E.g.: Inserting all the levels of study.
	        
	        //Initialising Level of study:
	        
	        //If empty:
	        res = stmt.executeQuery("SELECT COUNT(*) FROM LevelOfStudy");
	        res.next();
	        if(res.getInt(1) == 0)
	            stmt.executeUpdate("INSERT INTO LevelOfStudy VALUES "+
	                               "('1','Certificate of Higher Education'),"+
	                               "('2','Diploma of Higher Education'),"+
	                               "('3','Degree with Honours'),"+
	                               "('4','Master degree'),"+
	                               "('5','Doctorate'),"+
	                               "('P','Placement Year');");	           
	    }
	    catch(SQLException ex) {
	    	ex.printStackTrace();
	    }
		finally{
			if(res!=null)
				res.close();
			if(stmt!=null)
				stmt.close();
			if(con != null)
				con.close();
		}
    }
}
