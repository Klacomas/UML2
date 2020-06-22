package modelo;

public class CategoriaProducto {

	private String id;
	private String nombre;
	private String descripcion;
	private String status;
	public CategoriaProducto(String id, String nombre, String descripcion, String status) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.status = status;
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "CategoriaProducto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", status="
				+ status + "]";
	}
	
	
}
