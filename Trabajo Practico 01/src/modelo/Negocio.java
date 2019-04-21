package modelo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Negocio {

	private List<Producto> misProductos;
	private static Negocio n;

	private Negocio() {

		misProductos= new ArrayList<Producto>();
		
	}

	public static Negocio getInstancia() {

		if (n==null) {
			n= new Negocio ();
			return n;
		}else {
			return n;
		}

	}

	public boolean addProducto(Producto p) {
 
		return misProductos.add(p);

	}


	public void delAllProductos() {

		misProductos.clear();
	}

	public List<Producto> getProductos(){
		return this.misProductos;
	}

	public List<Producto> getProductos(String parteCodigo){

		ArrayList<Producto> nuevos= new ArrayList<Producto>();


		for (int i=0;i<misProductos.size();i++) {
			if (misProductos.get(i).getCodigo().contains(parteCodigo)) {
				nuevos.add(misProductos.get(i));

			}
		}
		Collections.sort(nuevos, new OrdenProducto());
		return nuevos;
	}


	public double getTotal(Producto ... lista) {
		double suma = 0 ;
		
		for (int i = 0; i < lista.length; i++) {
			suma+= lista[i].getLastPrecioNumero();
		}
		return suma;

	}
}
