import java.sql.*;
public class Hello {
	public void getcon() throws SQLException{
			String url ="jdbc:mysql://127.0.0.1:3306/kuru";
			String username = "root";
			String password = "1325";
			String Query = "insert into madara values(?,?)";
			
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement pst = con.prepareStatement(Query);
			pst.setInt(1,2);
			pst.setString(2,"GURU");
			pst.executeUpdate();
	}

}
