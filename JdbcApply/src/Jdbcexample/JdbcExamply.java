package Jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcExamply {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		//step1 :load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded successfully.....");
		//step2:create the connection)
		Connection connection= DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe","eswari","welcome");
		System.out.println("connection create Successfully...");
	
		
		

	}

}
 