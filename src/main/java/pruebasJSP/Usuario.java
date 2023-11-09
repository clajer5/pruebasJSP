package pruebasJSP;



public class Usuario {
	private String nombre;
	private String email;
	private int id;
	
	public Usuario() {
	}
	public Usuario(String nombre, String email, int id) {
		this.setNombre(nombre);
		this.setEmail(email);
		this.setId(id);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}
}

