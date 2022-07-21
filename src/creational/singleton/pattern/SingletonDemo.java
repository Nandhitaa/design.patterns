package creational.singleton.pattern;

import java.sql.SQLException;

public class SingletonDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		JDBCSingleton jdbc = JDBCSingleton.getInstance();
		jdbc.read("test");
		jdbc.read("test1");
	}

}
