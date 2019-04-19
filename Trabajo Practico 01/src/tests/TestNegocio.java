package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import modelo.*;

class TestNegocio {

	@Test
	void test04NegocioOrdenCodigo() { 
		Negocio.getInstancia().delAllProductos();
		assertEquals(true,Negocio.getInstancia().addProducto("12379",Modelo.Nautico,28,12.30));
		assertEquals(true,Negocio.getInstancia().addProducto("12376",Modelo.Bota,28,12.20));
		assertEquals(true,Negocio.getInstancia().addProducto("12008",Modelo.Sandalia,28,12.10));
		List<Producto> aux;
		aux = Negocio.getInstancia().getProducto("37");
		assertEquals(2,aux.size()); 
		assertEquals("012376",aux.get(0).getCodigo());
		assertEquals("012379",aux.get(1).getCodigo());
		aux = Negocio.getInstancia().getProducto("5");
		assertEquals(0,aux.size());
		aux = Negocio.getInstancia().getProducto("");
		assertEquals(3,aux.size());
		assertEquals("012008",aux.get(0).getCodigo());
		assertEquals("012376",aux.get(1).getCodigo());
		assertEquals("012379",aux.get(2).getCodigo());

		Negocio.getInstancia().delAllProductos();
		aux = Negocio.getInstancia().getProducto("");
		assertEquals(0,aux.size());
	}

	@Test
	void test05NegocioOrdenProducto() {



		Negocio.getInstancia().delAllProductos();

		assertEquals(true,Negocio.getInstancia().addProducto("12",Modelo.Nautico,28,12.30));
		assertEquals(true,Negocio.getInstancia().addProducto("94",100,"rojo",12.20));
		assertEquals(true,Negocio.getInstancia().addProducto("14",Modelo.Sandalia,28,12.10));
		assertEquals(true,Negocio.getInstancia().addProducto("90",120,"azul",12.00));

		List<Producto> aux;

		aux = Negocio.getInstancia().getProductoOP("");

		assertEquals(4,aux.size());
		assertEquals("000090",aux.get(0).getCodigo());
		assertEquals("000094",aux.get(1).getCodigo());
		assertEquals("000012",aux.get(2).getCodigo());
		assertEquals("000014",aux.get(3).getCodigo());

		aux = Negocio.getInstancia().getProductoOP("4");

		assertEquals(2,aux.size());
		assertEquals("000094",aux.get(0).getCodigo());
		assertEquals("000014",aux.get(1).getCodigo());

		aux = Negocio.getInstancia().getProductoOP("1");

		assertEquals(2,aux.size());
		assertEquals("000012",aux.get(0).getCodigo());
		assertEquals("000014",aux.get(1).getCodigo());

		Negocio.getInstancia().delAllProductos();
		aux = Negocio.getInstancia().getProductoOP("");
		assertEquals(0,aux.size());

	}


	@Test
	void test06NegocioBusquedaEspecialZapato() {


		Negocio.getInstancia().delAllProductos();

		assertEquals(true,Negocio.getInstancia().addProducto("12399",Modelo.Nautico,28,12.30));
		assertEquals(true,Negocio.getInstancia().addProducto("12390",100,"rojo",12.20));
		assertEquals(true,Negocio.getInstancia().addProducto("12388",Modelo.Sandalia,28,12.10));
		assertEquals(true,Negocio.getInstancia().addProducto("12006",120,"azul",12.00));
		assertEquals(true,Negocio.getInstancia().addProducto("12021",Modelo.Nautico,28,12.50));

		List<Producto> aux;

		aux = Negocio.getInstancia().getProducto(Modelo.Nautico);

		assertEquals(2,aux.size());
		assertEquals("012021",aux.get(0).getCodigo());
		assertEquals("012399",aux.get(1).getCodigo());

		aux = Negocio.getInstancia().getProducto(Modelo.Bota);
		assertEquals(0,aux.size());

		Negocio.getInstancia().delAllProductos();
	}

	@Test
	void test07NegocioBusquedaEspecialCinto() {

		Negocio.getInstancia().delAllProductos();

		assertEquals(true,Negocio.getInstancia().addProducto("12399",Modelo.Nautico,28,12.30));
		assertEquals(true,Negocio.getInstancia().addProducto("12390",100,"rojo",12.20));
		assertEquals(true,Negocio.getInstancia().addProducto("12388",Modelo.Sandalia,28,12.10));
		assertEquals(true,Negocio.getInstancia().addProducto("12006",120,"azul",12.00));
		assertEquals(true,Negocio.getInstancia().addProducto("12021",Modelo.Nautico,28,12.50));

		List<Producto> aux;
		int largoMenorA = 110;
		aux = Negocio.getInstancia().getProducto(largoMenorA);

		assertEquals(1,aux.size());
		assertEquals("012390",aux.get(0).getCodigo());

		largoMenorA = 140;
		aux = Negocio.getInstancia().getProducto(largoMenorA);

		assertEquals(2,aux.size());
		assertEquals("012006",aux.get(0).getCodigo());
		assertEquals("012390",aux.get(1).getCodigo());

		largoMenorA = 90;
		aux = Negocio.getInstancia().getProducto(largoMenorA);

		assertEquals(0,aux.size());

		Negocio.getInstancia().delAllProductos();
	}

	@Test
	void test08NegocioGetTotal() {

		Negocio.getInstancia().delAllProductos();

		Producto p = new Zapato("12345",Modelo.Nautico,28,12.30);
		Producto p1 = new Zapato("892",Modelo.Bota,8, 13.45);
		Producto p2 = new Cinto("10",80,"VERDE",10);
		Producto p3 = new Cinto("1",45,"rosita feo",90);

		assertEquals(25.75, Negocio.getInstancia().getTotal(p,p1));
		assertEquals(12.30, Negocio.getInstancia().getTotal(p));
		assertEquals(35.75, Negocio.getInstancia().getTotal(p,p1,p2));
		assertEquals(125.75, Negocio.getInstancia().getTotal(p,p1,p2,p3));

	}

}
