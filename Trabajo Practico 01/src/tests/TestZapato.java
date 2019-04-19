package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Modelo;
import modelo.Producto;
import modelo.Zapato;

class TestZapato {

	@Test
	void crearZapato_modeloNautico_zapatoCreado() {
		
		Producto p = new Zapato("12345",Modelo.Nautico,28,12.30);
		assertEquals("ZN012345t28 $  12.3", p.toString());

		Producto p2 = new Zapato("5",Modelo.Nautico,0,0);
		assertEquals("ZN000005t00 $   0.0", p2.toString());

		
	}
	@Test
	void crearZapato_modeloBota_zapatoCreado() {
		Producto p1 = new Zapato("892",Modelo.Bota,8, 13.45);
		assertEquals("ZB000892t08 $ 13.45", p1.toString());
	}
	
	@Test
	void crearZapato_modeloSandalia_zapatoCreado() {
		Producto p3 = new Zapato("12345",Modelo.Sandalia,12);
		assertEquals("ZZ012345tST $  12.0", p3.toString());
	}

}
