import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import es.com.escuela_it.main.clase6.jdbc.ConnectionDatabase;

public class ConnectionDatabaseTest {

	public static void main(String[] args) {

		ConnectionDatabase connDatabase = ConnectionDatabase.getInstance();
		Connection connection = connDatabase.getConnection();

		int limite = 4;

		try (PreparedStatement stmt = connection.prepareStatement("select * from players limit ?")) {

			stmt.setInt(1, limite);

			try (ResultSet cursor = stmt.executeQuery()) {

				System.out.println("Formacion Italia 90________________________-");

				while (cursor.next()) {

					int id = cursor.getInt("id");
					String name = cursor.getString("name");
					
					
					System.out.println(id + " - " + name);
				}

			}
		} catch (SQLException e) {

			System.out.println("Error al consultar jugadores" + e);
		}

	}

}
