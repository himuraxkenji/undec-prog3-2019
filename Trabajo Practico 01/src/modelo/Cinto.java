package modelo;

public class Cinto extends Producto{
	private int largo;
	private String color;

	public Cinto(String codigo, double precio, int largo, String color, double precioInicial) {
		
		super (codigo, precio);
		super.cambiarPrecio(precioInicial);
		this.largo=largo;
		this.color=color; 
		
	}

	public int getLargo() {

		return this.largo;
	}
	
	public String getColor() {

		return this.color;
	}

}
