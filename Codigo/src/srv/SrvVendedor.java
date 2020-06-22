package srv;

import java.util.Scanner;

import modelo.Vendedor;

public class SrvVendedor {

	public boolean seteaProductos() {
		return false;
	}
	public static Vendedor crearVendedor() {
	Scanner sc = new Scanner(System.in);	
	System.out.println("***Crear vendedor***");
	System.out.println("Ingrese ID:");
	String id = sc.nextLine();
	System.out.println("Ingrese nombre:");
	String nombre = sc.nextLine();
	System.out.println("Ingrese correo:");
	String correo = sc.nextLine();
	System.out.println("Usuario es Admin? (S/N):");
	Boolean esAdmin=false;
	if (sc.nextLine().equals("S")) {
		esAdmin=true;
	}
	System.out.println("Ingrese Password:");
	String password = sc.nextLine();
	Vendedor vendedor = new Vendedor(id, nombre, correo, esAdmin, password);
	System.out.println("Vendedor creado");
	System.out.println(vendedor.toString());
	sc.close();
	return vendedor;
		
	}
	
	
	
}
