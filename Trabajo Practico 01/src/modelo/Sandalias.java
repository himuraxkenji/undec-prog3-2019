package modelo;

public class Sandalias extends Producto implements Calzado{
	
	private int talle;
	private String materialSuela;
	
	public Sandalias(String codigo, double precio, int talle, String materialSuela) {
		super(codigo, precio);
		this.talle = talle;
		this.materialSuela = materialSuela;
	}

	@Override
	public String getMiModelo() {
		return this.getClass().getSimpleName();
	}

	@Override
	public int getTalle() {
		return this.talle;
	}
	
	public String getMaterialSuela() {
		return this.materialSuela;
	}
	
	
}
