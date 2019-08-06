package klenkar.summertask;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadFromDatabase {

	private Connection connection;

	public ReadFromDatabase() {
		connection = ConnectToDatabase.getConnection();
	}

	public void readApplicantsFromDatabase() {

		try {
			PreparedStatement expression = connection.prepareStatement("select * from applicant");
			ResultSet rs = expression.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("firstName") + " " + rs.getString("lastName"));
			}
			rs.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) {
		new ReadFromDatabase();
	}

}
