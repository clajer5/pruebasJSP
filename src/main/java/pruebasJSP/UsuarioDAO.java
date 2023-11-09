package pruebasJSP;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pruebasJSP.Usuario;
public class UsuarioDAO {
	private Connection connection;
	
	public UsuarioDAO() {
		System.out.println("Esstableciendo");
		connection = ConexionSQLite.obtenerConexion();
	}
	
	public void insertarUsuario(Usuario usu) {
		try {
			if(connection != null) {
			String sql = "INSERT INTO usuarios (nombre, email, id) VALUES (?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, usu.getNombre());
			statement.setString(2, usu.getEmail());
			statement.setInt(3, usu.getId());
			statement.executeUpdate();
			}
			else {
				System.err.println("La conexion es nula");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Usuario> listarUsuarios(){
		List<Usuario> usuarios = new ArrayList<Usuario>();
		try {
			String sql = "SELECT id, nombre, email FROM usuarios";
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(result.getInt("id"));
				usuario.setNombre(result.getString("nombre"));
				usuario.setEmail(result.getString("email"));
				usuarios.add(usuario);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuarios;
	}
}
