import java.sql.*;


public class JavaLesson34 {

	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			//com.mysql.cj.jdbc.Driver
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/sakila","root","Sifre12345!");
			Statement sqlState = conn.createStatement();
			String selectStuff = " select first_name from customer limit 15";
			ResultSet rows = sqlState.executeQuery(selectStuff);
			
			while(rows.next()) {
				System.out.println(rows.getString("first_name"));
			}
			
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
			System.out.println("Vendor Error: " + e.getErrorCode());

		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
