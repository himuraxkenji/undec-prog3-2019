package modelo;

public class Nauticos extends Producto implements Calzado{
	
	private int talle; 
	private String materialSuperior;
	private String materialSuela;
	
	
	public Nauticos(String codigo, double precio, int talle, String materialSuela, String materialSup) {
		super(codigo, precio);
		this.talle = talle;
		this.materialSuela = materialSuela;
		this.materialSuperior = materialSup;
		
	}

	@Override
	public String getMiModelo() {
		return this.getClass().getName();
	}

	@Override
	public int getTalle() {
		return this.talle;
	}

	public String getMaterialSuela() {
		return this.materialSuela;
	}
	
	public String getMaterialSuperior() {
		return this.materialSuperior;
	}
}
