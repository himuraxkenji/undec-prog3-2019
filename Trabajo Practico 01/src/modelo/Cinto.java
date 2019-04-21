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

	@Override
	public String toString() {
		String nuevos;
		String largo=Integer.toString(this.largo);
		if (this.color.contains(" ")) {
			String[] nuevo= this.color.split(" ");
			nuevos= nuevo[0].substring(0,1).toUpperCase()+nuevo[0].substring(1,nuevo[0].length()).toLowerCase()+nuevo[1].substring(0,1).toUpperCase()+nuevo[1].substring(1, nuevo[1].length()).toLowerCase();
			if (largo.length()==2) {
				return "C"+this.getCodigo()+"l0"+largo+"c"+nuevos.trim()+" "+this.getLastPrecio();
			}else {
				return "C"+this.getCodigo()+"l"+largo+"c"+nuevos.trim()+" "+this.getLastPrecio();
			}


		}else {
			nuevos=this.color.substring(0, 1).toUpperCase()+this.color.substring(1,this.color.length()).toLowerCase();
			if (largo.length()==2) {
				return "C"+this.getCodigo()+"l0"+largo+"c"+nuevos.trim()+" "+this.getLastPrecio();
			}else {
				return "C"+this.getCodigo()+"l"+largo+"c"+nuevos.trim()+" "+this.getLastPrecio();
			}

		}


	}

	public int getLargo() {

		return this.largo;
	}
	
	public String getColor() {

		return this.color;
	}

}
