package creational.object.pool.pattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionPool extends ObjectPool<Connection> {

	private String dataSourceName;
	private String username;
	private String password;

	JDBCConnectionPool(String dsn, String user, String password) throws ClassNotFoundException {
		Class.forName("org.postgresql.Driver");
		this.dataSourceName = dsn;
		this.username = user;
		this.password = password;
	}

	@Override
	public Connection create() {
		try {
			return DriverManager.getConnection(dataSourceName, username, password);
		}
		catch (SQLException e) {
			return null;
		}
	}

}
