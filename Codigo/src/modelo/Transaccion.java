package modelo;

import java.util.ArrayList;

public class Transaccion {

	private Usuario usuario;
	ArrayList <Producto> lstProducto;

	
	public Transaccion(Usuario usuario, ArrayList<Producto> lstProducto) {
		super();
		this.usuario = usuario;
		this.lstProducto = lstProducto;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public ArrayList<Producto> getLstProducto() {
		return lstProducto;
	}
	public void setLstProducto(ArrayList<Producto> lstProducto) {
		this.lstProducto = lstProducto;
	}


}
