package modelo;
import java.util.ArrayList;

import java.util.List;

public class Producto{
	private String codigo;
	private List<Double> misPrecios = new ArrayList<Double>();
	
	public Producto(String codigo) {
		this.codigo = codigo;
	}
	
	public boolean cambiarPrecio(double valor) {
		for (Double prec : misPrecios) {
			if(prec == valor)
				return false;
		}
		
		return misPrecios.add(valor);
		
	}
	
	public String getCodigo() {
		if(this.codigo.length() < 6) {
			int tam = 6 - this.codigo.length();
			for(int i = 0; i < tam; i++)
				this.codigo = "0" + this.codigo;
		}else {
			this.codigo = this.codigo.substring(0, 5);
		}
		
		return this.codigo;
	}
	
	public String getLastPrecio() {
		
		if(misPrecios.size() == 0 || misPrecios == null)
			return "$0";
//		
		String prec = Double.toString(misPrecios.get(misPrecios.size()-1));
		
		int espacio = 6 - prec.length(); 
		
		String precio = "$";
		
		for (int i = 0; i < espacio; i++) {
			precio += " ";
		}
		
		return precio + prec;
		
	}
////	
//	public double getLastPrecioNumero() {
//		
//	}
//	

	
}

