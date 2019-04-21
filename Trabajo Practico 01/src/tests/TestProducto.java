package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import modelo.*;

class TestProducto {
	
	// Nomenclatura metodo o funcionalidad__EscenarioInicial_Resultado
	
	@Test 
	void nuevoProducto_ProductoNoExiste_ProductoCreado() {


		Producto p = new Producto("2345", 12.4); 
		
		assertEquals("002345", p.getCodigo());
		
	}
	
	@Test
	void getLastPrecio_ProductoSinPrecio_PrecioCero() {
		
		Producto p = new Producto("2345", 10.2);
		
		assertEquals("$  10.2", p.getLastPrecio());
	
	}
	 
	
	@Test
	void cambiarPrecio_ProductoConPrecioIgual_NoCambioPrecio() {
		Producto p = new Producto("2345", 12);
		p.cambiarPrecio(12);
		assertEquals(false,p.cambiarPrecio(12));
		assertEquals("$  12.0", p.getLastPrecio());
	}
	
	@Test
	void getLastPrecio_ProductoConPrecioIgual_NoCambioPrecio() {
		Producto p = new Producto("2345", 12);
		p.cambiarPrecio(12);
		p.cambiarPrecio(340);
		assertEquals("$ 340.0", p.getLastPrecio());
	}
	
}
