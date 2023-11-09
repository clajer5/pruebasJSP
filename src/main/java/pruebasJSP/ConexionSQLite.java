package pruebasJSP;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexionSQLite {
	public static Connection obtenerConexion() {
		Connection connection = null;
		try {
//			Properties properties = new Properties();
//			try {
//				System.out.println("Cargando informacion del archivo properties");
//				FileInputStream fileInputStream = new FileInputStream("conexion.properties");
//				properties.load(fileInputStream);
//				fileInputStream.close();
//			} catch (IOException e) {
//				System.out.println("Error al cargar el archivo " + e.getMessage());
//			}
//			String jdbcUrl = "jdbc:mysql://" + properties.getProperty("url.basedatos");
//			String user = properties.getProperty("basedatos.user");
//			String password = properties.getProperty("basedatos.password");
//			connection = DriverManager.getConnection(jdbcUrl, user, password);
			String url = "jdbc:mysql://localhost:3306/usuarios";
			String usuario = "user";
			String password = "user";
			connection = DriverManager.getConnection(url, usuario, password);
		} catch ( SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

}
