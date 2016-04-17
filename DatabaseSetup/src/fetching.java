import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

public class fetching {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstname, last, email, pass,id;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://85.10.205.173:3306/testing321", "tester321", "pass@123");

			String q = "select * from MyTest2 ";

			PreparedStatement ps = con.prepareStatement(q);
			ResultSet r = ps.executeQuery();

			while (r.next()) {
				id = r.getString("id");
				firstname = r.getString("first");
				last = r.getString("last");
				email = r.getString("email");
				pass = r.getString("pass");
				
				System.out.println(id+"\n"+ firstname + "\n" + last + "\n" + email + "\n" + pass);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
