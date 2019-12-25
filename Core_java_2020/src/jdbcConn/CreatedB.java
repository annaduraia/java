package jdbcConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatedB {

	private static String password="aavanor";
	private static String user="employee";
	private static String url="jdbc:oracle:thin:@192.168.1.30:1521:xe";

	public static void main(String[] args) {
		Connection connection=null;
		Statement statement = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDrive");
			connection = DriverManager.getConnection(url, user, password);
			
			statement = connection.createStatement();
			String sql = "CREATE DATABASE STUDENTS";
			statement.executeUpdate(sql);
System.out.println("Success..");
			connection.close();
			//statement.executeUpdate("insert into STUDENTS values(11, 'text')");
		} catch (Exception e) {
			System.out.println(e);
		}
		finally{
			 
		}
	}
}
