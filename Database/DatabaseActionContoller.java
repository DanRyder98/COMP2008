package database;

import java.sql.*;
import java.util.*;

public abstract class DatabaseModel {
	
    private Connection connection;
    private PreparedStatement preparedStatement;
	
	protected void initConnection() 
	{
        connection = null;
    }
	
	protected void initializeStatement() 
	{
        statement = null; 
    }
	
	protected void openConnection() throws SQLException 
	{
        connection = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team045", "team045", "09fa15e9");
    }
	
    protected Connection getConnection() throws SQLException 
	{
        return connection;
    }
	
    protected void closeConnection() throws SQLException 
	{
        if (connection != null) {
            connection.close();
        }
    }
	
	protected void openStatement() throws SQLException 
	{
        preparedStatement = connection.preparedStatement(); 
    }
    
    protected void closeStatement() throws SQLException 
	{
        if (preparedStatement != null) 
		{
            preparedStatement.close();
        }
    }
	
	//get
	protected void openResultQuery(String query) throws SQLException
	{
    resultSet = getStatement().executeQuery(query); 
    }
    
    protected void closeResultQuery() throws SQLException 
	{
        if (resultSet != null) 
		{
            resultSet.close();
        }
    }
	
	protected Statement preparedStatement() 
	{
        if (preparedStatement != null) 
		{
            return preparedStatement;
        } 
		else 
		{
            return null;
        }
    }
    
    public void insertIntoDatabase(String table, String values)
	{
        execute("INSERT INTO " + table + " VALUES " + values + ";");
    }
    
    public void removeFromDatabase(String table, String conditions)
	{
        execute("DELETE FROM " + table + " WHERE " + conditions + ";");
    }
    
    private void execute(String querry)
	{
        try
		{
            openConnection();
            openStatement();
            try
			{
                int count = preparedStatement().executeUpdate(querry);
            }
            finally 
			{
                closeStatement();
                closeConnection();
            }
        } 
        catch (SQLException ex)
		{
            ex.printStackTrace();
        }
    }

    protected ResultSet getResult() 
	{ 
        return resultSet; 
    }   
}