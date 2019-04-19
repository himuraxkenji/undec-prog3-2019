package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.*;

class TestCinto {
 
	@Test
	void crearCinto_cintoNoExiste_cintoCreado() {


		Producto c = new Cinto("654",100,"rojo",9);
		
		assertFalse(c.equals(null));
	
	}	
	@Test
	void toString_cintoCreado_obtuvoCodigo() {
	
		Producto c = new Cinto("654",100,"rojo",9);
		
		assertEquals("C000654l100cRojo $   9.0", c.toString());

	}

}
