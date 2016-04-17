import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		new guitest();
		
		
		String firstname, last, email, pass;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter values: ");
		firstname = sc.next();
		last = sc.next();
		email = sc.next();
		pass = sc.next();

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
//			Connection con = DriverManager.getConnection(
//					"jdbc:mysql://localhost/testing2",
//					"root", "");
//			
//			String q = "insert into tester(first,last,email,pass)values(?,?,?,?)";
//			
//			PreparedStatement ps = con.prepareStatement(q);
//			ps.setString(1, firstname);
//			ps.setString(2, last);
//			ps.setString(3, email);
//			ps.setString(4, pass);
//			ps.execute();
			
			
			try {
	            Class.forName("com.mysql.jdbc.Driver");
	            System.out.println("connected");
	        } catch (ClassNotFoundException e) {
	            System.out.println(" Unable to load driver. ");
	        }
			Connection con = null;
			String url = "jdbc:mysql://85.10.205.173:3306/testing321";
	        String username = "tester321";
	        String password = "pass@123";
	        try {
	            con = DriverManager.getConnection(url, username, password);
	             System.out.println(" Connection Established. ");
	        } catch (SQLException e) {
	            System.out.println(" Error connecting to database:  "
	                    + e);
	        }
	        
			
			String q = "insert into MyTest2(first,last,email,pass)values(?,?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(q);
			ps.setString(1, firstname);
			ps.setString(2, last);
			ps.setString(3, email);
			ps.setString(4, pass);
			ps.execute();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Your data is: ");
		
		fetching.main(args);

	}
	
	

}
