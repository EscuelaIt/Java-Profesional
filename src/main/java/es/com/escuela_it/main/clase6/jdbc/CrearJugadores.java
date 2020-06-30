package es.com.escuela_it.main.clase6.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearJugadores {

	public static void main(String[] args) {

		ConnectionDatabase connDatabase = ConnectionDatabase.getInstance();
		Connection connection = connDatabase.getConnection();

		try (PreparedStatement stmt = connection.prepareStatement("insert into players(name) values(?)",
				Statement.RETURN_GENERATED_KEYS)) {
			
			connection.setAutoCommit(false);//Begin
			
			stmt.setString(1, "Pepe");
			int recAffected = stmt.executeUpdate();
			System.out.println(recAffected);
			ResultSet keys = stmt.getGeneratedKeys();
			keys.next();
			int idGenerado = keys.getInt(1);
			
			System.out.println("Se creo el jugador con el id " + idGenerado);
			
			connection.commit();//COMMIT

		} catch (SQLException e) {
			
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Error en rolback " + e1);
			}
			System.out.println("Error al crear jugador " + e);
		}

	}

}
