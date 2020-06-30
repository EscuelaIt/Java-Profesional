package es.com.escuela_it.main.clase6.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Optional;

import es.com.escuela_it.main.clase5.collections.Estadio;
import es.com.escuela_it.main.clase6.jdbc.ConnectionDatabase;

public class EstadioDao implements Dao<Estadio>{

	public List<Estadio> listAll() {

		return null;
	}


	public void save(Estadio estadio) {

		ConnectionDatabase connDatabase = ConnectionDatabase.getInstance();
		Connection connection = connDatabase.getConnection();

		try (PreparedStatement stmt = connection.prepareStatement("insert into stadiums(name,capacity) values(?,?)",
				Statement.RETURN_GENERATED_KEYS)) {

			stmt.setString(1, estadio.getName());
			stmt.setInt(2, estadio.getAforo());
			int recAffected = stmt.executeUpdate();
			System.out.println(recAffected);
			ResultSet keys = stmt.getGeneratedKeys();
			keys.next();
			int idGenerado = keys.getInt(1);

			System.out.println("Se creo el estadio con el id " + idGenerado);

		} catch (SQLException e) {
			System.out.println("Error al crear estadio " + e);
		}

	}

	public void delete(Estadio estadio) {

	}

	public Estadio update(Estadio estadio) {
		return null;
	}


	@Override
	public Optional<Estadio> findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
