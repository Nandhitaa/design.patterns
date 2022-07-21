package creational.singleton.pattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCSingleton {

	private static JDBCSingleton jdbc;

	private JDBCSingleton() {
	}

	public static JDBCSingleton getInstance() {
		if (jdbc == null) {
			jdbc = new JDBCSingleton();
		}
		return jdbc;
	}

	private static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		Class.forName("org.postgresql.Driver");
		con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testDB", "postgres", "postgres");
		return con;
	}

	public void read(String user) throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		String sql = "SELECT id, name FROM testSchema.users WHERE name = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, user);
		ResultSet rs = ps.executeQuery();
		if (rs.next() == false) {
			PreparedStatement ps1 = con.prepareStatement("SELECT id, name from testSchema.users order by id");
			rs = ps1.executeQuery();
			rs.next();
		}
		do {
			System.out.println(rs.getInt(1) + " : " + rs.getString(2));
		} while (rs.next());
		con.close();

	}
}
