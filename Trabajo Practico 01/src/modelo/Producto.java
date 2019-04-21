package modelo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Producto implements Comparable<Producto>{
	
	private String codigo;
	private List<Double> historialPrecios=new ArrayList<Double>();

	public Producto(String codigo, double precio) {
		
		this.codigo=codigo;
		
		this.historialPrecios.add(precio);

	}
	


	public boolean cambiarPrecio(double valor) {

		for (int i=0;i<historialPrecios.size();i++) {
			if (historialPrecios.get(i).equals(valor)) {
				return false;
			} 
		}
		
		return historialPrecios.add(valor);
	}

	public String getCodigo() {
		
		String aux = this.codigo;
		
		for(int i = this.codigo.length(); i < 6; i++) 

			aux= "0" + aux;
		
		return aux;
	}

	public String getLastPrecio() {

		String miPrecio = "";
		String retorna = "$ ";
		
		if (historialPrecios.size() == 0  || historialPrecios == null)
			return "$0";
		if ((historialPrecios.get(historialPrecios.size()-1))==0)
			return "$   "+"0.0";
		
		miPrecio=Double.toString(historialPrecios.get(historialPrecios.size()-1));
		
		for (int i = miPrecio.length(); i < 5; i++) 
			retorna+=" ";

		return retorna+miPrecio;
	}

	public double getLastPrecioNumero() {

		return (historialPrecios.get(historialPrecios.size()-1));

	}

	@Override
	public int compareTo(Producto arg0) {
		return getCodigo().compareTo(arg0.getCodigo());

	}

}

class OrdenProducto implements Comparator<Producto>{

	@Override
	public int compare(Producto o1, Producto o2) {
		return o1.toString().compareTo(o2.toString());
	}

}


