package Day21;

import java.sql.*;

public class testing {

	public static void main(String[] args) {
		//create connection
		Save_with_statement();
	}

	private static void Save_with_statement() {
		try(Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/batch_3","root","")){
			System.out.println("Get connection!");
			
			//define query
//			String query = "INSERT INTO employees(emp_no,name,salary,city,birthday)VALUES(AungAung,"
			//papered statement
//			PreparedStatement pstm = con.prepareStatement(query);
			//create statement
			Statement st = con.createStatement();
			
			//define query
//			String query = "SELECT * FROM employees";
			
			//execute query
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//another method
		try(Connection con = DriverManager
				.getConnection("jdbc:mariadb://localhost:3306/batch_3?user=root")){
				System.out.println("Create Connection Object");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
