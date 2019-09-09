package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import bean.LoginBean;
import util.DBConnection;

public class LoginDao {
	public String registerUser(LoginBean loginbean)
	 {
	 String Username = loginbean.getUsername();
	 String Password = loginbean.getPassword();
	 Connection con = null;
	 PreparedStatement preparedStatement = null;
	 try
	 {
	 con = DBConnection.createConnection();
	 String query = "select * from Userapply where Username=? and Password=?";
	 preparedStatement = con.prepareStatement(query); 
	 preparedStatement.setString(1, Username);
	 preparedStatement.setString(2, Password);
	 int i= preparedStatement.executeUpdate();
	 
	 if (i!=0) {
	 return "SUCCESS"; 
	 }
	 else
	 {
		 return "failed";
	 }
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }

	 return "hi";
}
}