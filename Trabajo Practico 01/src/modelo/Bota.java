package modelo;

public class Bota extends Producto implements Calzado{
	
	private int talle;
	private Cania cania;
	
	public Bota(String codigo, double precio, int talle, Cania cania) {
		
		super(codigo, precio);
		this.talle = talle;
		this.cania = cania;
	
	}

	

	@Override
	public String getMiModelo() {
		return this.getClass().getSimpleName();
	}

	@Override
	public int getTalle() {
		return this.talle;
	}
	
	public String getCania() {
		return (this.cania).name();
	}
}
