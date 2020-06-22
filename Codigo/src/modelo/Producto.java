package modelo;

public class Producto extends CategoriaProducto {
	private Categoria categoria;
	private String id;

	public Producto(String id, String nombre, String descripcion, String status) {
		super(id, nombre, descripcion, status);
		// TODO Auto-generated constructor stub
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Producto [categoria=" + categoria + ", id=" + id + "]";
	}

}
