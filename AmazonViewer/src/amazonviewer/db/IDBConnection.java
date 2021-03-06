package amazonviewer.db;

import java.sql.Connection;
import java.sql.DriverManager;
import static amazonviewer.db.DataBase.*;

public interface IDBConnection {
	
	@SuppressWarnings("finally")
	default Connection connectToDB() {
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(URL+DB, USER, PASSWORD);
			if (connection != null) {
				System.out.println("Se establecio la conexion :)");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			 return connection;
		}
	}

}
