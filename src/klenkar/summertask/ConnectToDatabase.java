package klenkar.summertask;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectToDatabase {

	public static Connection getConnection() {

		try {

			Class.forName("org.mariadb.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mariadb://localhost/human_resources", "jelena", "jelena");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
