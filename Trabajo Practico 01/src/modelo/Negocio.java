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

	public boolean addProducto(String codigo, Modelo m, int talle, double precio) {

		return misProductos.add(new Zapato(codigo,m,talle,precio));

	}

	public boolean addProducto(String codigo, int largo, String color, double precio) {
		return misProductos.add(new Cinto (codigo, largo,color, precio));

	}

	public void delAllProductos() {

		misProductos.clear();
	}

	public List<Producto> getProducto(String parteCodigo){
		ArrayList<Producto> nuevos= new ArrayList<Producto>();
		//		if(parteCodigo.length() == 0) {
		//			System.out.println(misProductos.size());
		//			Collections.sort(misProductos);
		//			return misProductos;
		//		}
		for (int i=0;i<misProductos.size();i++) {
			if (misProductos.get(i).getCodigo().contains(parteCodigo)) {
				nuevos.add(misProductos.get(i));
			}
		}
		Collections.sort(nuevos);
		return nuevos;
	}

	public List<Producto> getProductoOP(String parteCodigo){

		ArrayList<Producto> nuevos= new ArrayList<Producto>();


		for (int i=0;i<misProductos.size();i++) {
			if (misProductos.get(i).getCodigo().contains(parteCodigo)) {
				nuevos.add(misProductos.get(i));

			}
		}
		Collections.sort(nuevos, new OrdenProducto());
		return nuevos;
	}


	public List<Producto> getProducto(Modelo m){

		ArrayList<Producto>nuevo= new ArrayList<Producto>();

		//		Zapato z;

		for (Producto producto : misProductos) {

			if (producto instanceof Zapato) {
				if (((Zapato)producto).getMiModelo().equals(m)) {
					nuevo.add(producto);
				}
			}

		}
		Collections.sort(nuevo);
		return nuevo;



	}

	public List<Producto> getProducto(int largoMenorA){
		ArrayList<Producto> nuevos= new ArrayList<Producto>();

		for (Producto producto: misProductos) {
			if (producto instanceof Cinto) {
				if (((Cinto)producto).getLargo()<largoMenorA) {
					nuevos.add(producto);
				}
			}
		}
		Collections.sort(nuevos);
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
