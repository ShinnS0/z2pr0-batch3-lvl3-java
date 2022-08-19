package Day23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class transactionManagement {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		try{
			con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/batch_3","root","");
			var insert1 = "INSERT INTO students(email,name)VALUES(?,?)";
			var insert2 = "INSERT INTO students(email,name)VALUES(?,?)";
//			var update = "UPDATE students SET email = ? WHERE id = ?";
			
			//disable auto-commit mode
//			con.setAutoCommit(false);
			
			var pstm = con.prepareStatement(insert1);
			pstm.setString(1, "jeon@gmail.com");
			pstm.setString(2, "Jeon");
			pstm.executeUpdate();
			
			pstm = con.prepareStatement(insert2);
			pstm.setString(1, "cherry@gmail.com");
			pstm.setString(2, "Cherry");
			pstm.executeUpdate();
			
			var pstm_update = con.prepareStatement("INSERT INTO students(email,name)VALUES(?,?)");
			pstm_update.setString(1, "aung@gmail.com");
			pstm_update.setString(2, "Aung Aung");
//			pstm_update.setInt(2,1);
			var i = pstm_update.executeUpdate();
			System.out.println("No of affected row: " + i);
			
//			con.commit();
			System.out.println("Success");
		}
		catch(Exception e) {
			con.rollback(); // rollback all change
			e.printStackTrace();
		}
		finally {
			con.close();
			}
	}
}
