package modelo;
public class Zapato extends Producto{
	
	private int miTalle;
	private Modelo miModelo;
	
	public Zapato(String codigo, Modelo m, int talle, double precioInicial) {
		super(codigo);
		this.cambiarPrecio(precioInicial);
		this.miModelo = m;
		this.miTalle = talle;
	}
	 
	public Zapato(String codigo, Modelo m, double precioInicial) {
		super(codigo);
		this.cambiarPrecio(precioInicial);
		this.miModelo = m;
		this.miTalle = -1;
	}
	
	public boolean modificarPrecio(double valor) {
		
	}

	public Modelo getModelo() {
		
	}	
	
	@Override
	public String toString() {
		String mensaje = "Z";
		
		if(this.miModelo.equals(Modelo.Bota))
			mensaje+="B";
		else if(this.miModelo.equals(Modelo.Nautico))
			mensaje+="N";
		else
			mensaje+="Z";
		
		mensaje+=super.getCodigo();

		if(this.miTalle < 0)
			mensaje+="tST"+ " ";
		
		 
		if(this.miTalle >= 0 && this.miTalle < 10)
			mensaje+="t0"+miTalle + " ";
		
		if(this.miTalle >= 10)
			mensaje+="t"+miTalle + " ";
		
		
		mensaje= mensaje + super.getLastPrecio();
		
		return mensaje; 
	}
	
}
