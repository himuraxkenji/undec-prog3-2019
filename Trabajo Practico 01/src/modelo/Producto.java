package modelo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Producto implements Comparable<Producto>{
	private String codigo;
	private List<Double> misPrecios=new ArrayList<Double>();

	public Producto(String codigo) {
		this.codigo=codigo;

	}

	public boolean cambiarPrecio(double valor) {


		for (int i=0;i<misPrecios.size();i++) {
			if (misPrecios.get(i).equals(valor)) {
				return false;
			}
		}
		misPrecios.add(valor);
		return true;


	}



	public String getCodigo() {

		if (this.codigo.length()==4) {
			return "00"+this.codigo;
		}else {
			if (this.codigo.length()==3) {
				return "000"+this.codigo;
			}else {
				if (this.codigo.length()==5) {
					return "0"+this.codigo;
				}else {
					if(this.codigo.length()==1){
						return "00000"+this.codigo;
					}else {
						if (this.codigo.length()==2) {
							return "0000"+this.codigo;
						}
					}
				}
			}
		}
		return this.codigo;
	}



	public String getLastPrecio() {

		String miPrecio;
		if (misPrecios.size() == 0  || misPrecios == null)
			return "$0";
		if ((misPrecios.get(misPrecios.size()-1))==0)
			return "$   "+"0.0";

		if (misPrecios.get(misPrecios.size()-1)>0) {
			miPrecio=Double.toString(misPrecios.get(misPrecios.size()-1));
			if (miPrecio.length()==5) {
				return "$ "+miPrecio;
			}else {
				if (miPrecio.length()==4) {
					return "$  "+miPrecio;
				}else {
					if (miPrecio.length()==3) {
						return "$   "+miPrecio;
					}else {
						if (miPrecio.length()==2) {
							return "$   "+miPrecio+".0";
						}
					}
				}

			}

		}

		return "";




	}

	public double getLastPrecioNumero() {
		double miPrecio;

		miPrecio=(misPrecios.get(misPrecios.size()-1));
		return miPrecio;

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


