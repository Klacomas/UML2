package modelo;

public class Usuario {
private String id;
private String nombre;
private String correo;
private Boolean esAdmin;
private String password;


public Usuario(String id, String nombre, String correo, Boolean esAdmin, String password) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.correo = correo;
	this.esAdmin = esAdmin;
	this.password = password;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}
public Boolean getEsAdmin() {
	return esAdmin;
}
public void setEsAdmin(Boolean esAdmin) {
	this.esAdmin = esAdmin;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return this.getClass().getSimpleName() + " [id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", esAdmin=" + esAdmin + ", password="
			+ password + "]";
}


}
