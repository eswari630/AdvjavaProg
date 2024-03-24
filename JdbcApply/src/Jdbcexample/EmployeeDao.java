package Jdbcexample;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EmployeeDao {

	private static final String Dbconnection = null;
	private Object prepareStatement;

	public int save(Employee emp, Object Connection, Object Preparedstatement) {
    //Declare the Resourse
	  Connection connection =null;
	 int count =0;
	 try {
	        //get the connection
	  	     Connection = Dbconnection.Createconnection();
	       //create the ps object
		     Preparedstatement = connection.prepareStatement("insert into empvalues(?,?,?)");
	        //read the data form emp object and set to parameters
		     Preparedstatement.setInt(1,emp.getEmpid());
		     Preparedstatement.setstring(2,emp.getEmpName());
		     Preparedstatement.setDouble(3,emp.getEmpsalary());
		     count = preparedstatement.executeUpdete();
	 
		   }
	     catch (SQLException e)
	     {
		  e.printstackTrace();
	     }
	     finally {
	    	        //before release connection check the connection present or not
	    	        if(Connection!=null)
	    		    Connection.close();
	    	        if(prepareStatement!=null)
	    		    preparedstatement.close();
	            }
	             return count;
	    	   
	  }
	}

 
