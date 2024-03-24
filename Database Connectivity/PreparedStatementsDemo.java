import java.sql.*;

public class PreparedStatementsDemo{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flexi","root","arar4601");  
  
PreparedStatement stmt=con.prepareStatement("insert into login values(?,?)");  
//stmt.setInt(,);
stmt.setString(1, "PFirst");
stmt.setString(2,"PPass");  
  
int i=stmt.executeUpdate();  
System.out.println(i+" records inserted");  
 stmt.close();
 con.close();  
  
	}
		catch(Exception e){ 
			System.out.println(e);
		}  
  
	}  
}