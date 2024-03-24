import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

public class LoginDemo {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Class named class in java
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flexi","root", "arar4601");
			
			System.out.println("Connection Established");
			
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("select *from login");
			boolean login=false;
			
			ResultSetMetaData rsMetaData = rs.getMetaData();
			System.out.println("Enter username:");
			String username = myObj.next();
			System.out.println("Enter password:");
			String pass = myObj.next();
			
			//System.out.println(rsMetaData.getColumnName(1) + "	" + rsMetaData.getColumnName(2));
			
			while(rs.next()) {
				
				//System.out.println(rs.getString(1) + "	" + rs.getString(2));
				if(username.equals(rs.getString("uname")) && pass.equals(rs.getString("pass"))) {
					login = true;
	                break;
				}
			}
			if (login) {
	            System.out.println("Logixn Successful");
	        } else {
	            System.out.println("Login Unsuccessful");
	        }
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}