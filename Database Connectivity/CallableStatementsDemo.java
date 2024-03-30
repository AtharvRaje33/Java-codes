import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.CallableStatement;

public class CallableStatementsDemo{
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Class named class in java
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root", "arar4601");
			
			System.out.println("Connection Established");
			String query = "call proc3;";
//			Statement st = conn.createStatement();
			CallableStatement stmt = conn.prepareCall(query);

			
					ResultSet rs = stmt.executeQuery();
			/*while(rs.next()) {
			//	System.out.println(rs.getString(2));   // prints city names
			int id = rs.getInt(1);
			if(id==100) {
				System.out.println(rs.getString(2));
			}
			}
			*/
			
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("Name of table:"+rsmd.getTableName(1));
			System.out.println("Number of columns:"+rsmd.getColumnCount());
			System.out.println("Column1 name:"+rsmd.getColumnName(1));
			System.out.println("Column2 name:"+rsmd.getColumnName(2));
			System.out.println("Column3 name:"+rsmd.getColumnName(3));
			System.out.println("Column1 name:"+rsmd.getColumnType(1));
			System.out.println("Column2 name:"+rsmd.getColumnType(2));
			System.out.println("Column3 name:"+rsmd.getColumnType(3));
			
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
