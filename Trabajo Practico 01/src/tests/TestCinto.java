package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.*;

class TestCinto {
 
	@Test
	void crearCinto_cintoNoExiste_cintoCreado() {


		Cinto c = new Cinto("654",12.3,100,"rojo",9);
		
		assertFalse(c.equals(null));
	
	}	
	
	@Test
	void getLargo_cintoCreado_obtuvoLargoCinto() {
	
		Cinto c = new Cinto("654",12.4 , 100,"rojo",9);
		
		assertEquals("9", c.getLargo());

	}
	
	@Test
	void getColor_cintoCreado_obtuvoColor() {
	
		Cinto c = new Cinto("654",12.4 , 100,"rojo",9);
		
		assertEquals("rojo", c.getColor());

	}

}
