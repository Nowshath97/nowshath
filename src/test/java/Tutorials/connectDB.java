package Tutorials;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class connectDB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("org.mariadb.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mariadb://localhost:3306/test","root","root");
		
		Statement smt=con.createStatement();
		
		ResultSet rs=smt.executeQuery("select Salary from salaries order by Salary desc limit 2");
		
		
		while(rs.next()){
			
			int Salary = rs.getInt("Salary");
			
			System.out.println("Book Name in Database is: " +Salary);
		}
	}

}
