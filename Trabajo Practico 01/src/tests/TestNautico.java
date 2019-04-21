package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Sandalias;

class TestNautico {

	@Test
	void crearNautico_NauticoNoExiste_NauticoCreado() {
		
		Sandalias s = new Sandalias("2131", 12.3, 34, "caucho");
		
		assertFalse(s == null);
	
	}
	
	@Test
	void getMiModelo_SandaliaConModelo_modeloSandalia() {
		
		Sandalias s = new Sandalias("2131", 12.3, 34, "caucho");
		
		assertEquals("Sandalias", s.getMiModelo());
	
	}
	
	@Test
	void getTalle_sandaliasTalle_talleSandalias() {
		
		Sandalias s = new Sandalias("2131", 12.3, 34, "caucho");
		
		assertEquals(34, s.getTalle());
	
	}
	
	
	@Test
	void getMaterialSuela_sandaliasConMaterial_MaterialSandalias() {
		
		Sandalias s = new Sandalias("2131", 12.3, 34, "caucho");
		
		assertEquals("caucho", s.getMaterialSuela());
	
	}

}
