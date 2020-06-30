package es.com.escuela_it.main.clase6.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionDatabase {

	private static ConnectionDatabase connectionDatabase;

	private Connection connection;

	private ConnectionDatabase() {

	}

	public static ConnectionDatabase getInstance() {

		if (connectionDatabase == null) {

			connectionDatabase = new ConnectionDatabase();
			connectionDatabase.connect();
		}

		return connectionDatabase;
	}

	private void connect() {

		ResourceBundle properties = ResourceBundle.getBundle("application");

		String dbName = properties.getString("app.db.name");
		String userName = properties.getString("app.db.username");
		String password = properties.getString("app.db.password");
		String host = properties.getString("app.db.host");
		String driver = properties.getString("app.db.driver");

		String url = "jdbc:" + driver + "://" + host + "/" + dbName;

		try {

			this.connection = DriverManager.getConnection(url, userName, password);

		} catch (SQLException e) {

			System.out.println("Error al conectar con la base de datos " + e.getMessage());

		}

	}

	public Connection getConnection() {

		return connection;
	}
}