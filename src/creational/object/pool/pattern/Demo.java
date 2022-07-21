package creational.object.pool.pattern;

import java.sql.Connection;

public class Demo {

	public static void main(String args[]) throws ClassNotFoundException {

		JDBCConnectionPool pool = new JDBCConnectionPool("jdbc://postgresql://localhost:5432/testDB", "postgres", "postgres");
		Connection con = pool.getObj();
		pool.returnObj(con);

	}

}
