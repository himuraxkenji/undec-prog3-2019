package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import modelo.*;

class TestNegocio {

	@Test
	void getProductos_listaVacia_ListaProductosOrdenada() { 
		Negocio.getInstancia().delAllProductos(); 
		Producto p1 = new Nauticos("12376",12.30, 28,  "Caucho", "Cuerina");
		Producto p2 = new Bota("12379",12.30, 15, Cania.Alta);
		Producto p3 = new Sandalias("12375",12.30, 28, "Goma");
		
		assertEquals(true,Negocio.getInstancia().addProducto(p1));
		assertEquals(true,Negocio.getInstancia().addProducto(p2));
		assertEquals(true,Negocio.getInstancia().addProducto(p3));
		
		List<Producto> aux = Negocio.getInstancia().getProductos();
		
		assertEquals(3,aux.size());  
		assertEquals("012376",aux.get(0).getCodigo());
		assertEquals("012379",aux.get(1).getCodigo());
		assertEquals("012375",aux.get(2).getCodigo());
	}

	@Test
	void delAllProductos_listaLlena_listaVacia() {
		
		Negocio.getInstancia().delAllProductos(); 
		Producto p1 = new Nauticos("12376",12.30, 28,  "Caucho", "Cuerina");
		Producto p2 = new Bota("12379",12.30, 15, Cania.Alta);
		Producto p3 = new Sandalias("12375",12.30, 28, "Goma");
		
		Negocio.getInstancia().addProducto(p1);
		Negocio.getInstancia().addProducto(p2);
		Negocio.getInstancia().addProducto(p3);

		Negocio.getInstancia().delAllProductos();

		List<Producto> aux = Negocio.getInstancia().getProductos();
		
		Negocio.getInstancia().delAllProductos();
		
		assertEquals(0,aux.size());

	}

	@Test
	void getTotal_listaProductosCargada_totalProductos() {

		Negocio.getInstancia().delAllProductos();

		Producto p1 = new Nauticos("12376",12, 28,  "Caucho", "Cuerina");
		Producto p2 = new Bota("12379",12, 15, Cania.Alta);
		Producto p3 = new Sandalias("12375",12, 28, "Goma");
		
		Negocio.getInstancia().addProducto(p1);
		Negocio.getInstancia().addProducto(p2);
		Negocio.getInstancia().addProducto(p3);
		
		
		assertEquals(36.0, Negocio.getInstancia().getTotal(p1,p2,p3));

	}

}
