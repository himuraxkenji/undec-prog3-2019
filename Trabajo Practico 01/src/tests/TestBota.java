package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Bota;
import modelo.Cania;

class TestBota {

	@Test
	void crearBota_botaNoExiste_BotaNoNula() {
		
		Bota b = new Bota("1234", 12.4, 42, Cania.Baja);
		
		assertFalse(b == null);
	
	}
	
	@Test
	void getMiModelo_botaConModelo_modeloBota() {
		
		Bota b = new Bota("1234", 12.4, 42, Cania.Baja);
		
		assertEquals("Bota", ((Bota)b).getMiModelo());
	
	}
	
	@Test
	void getTalle_botaTalle_talleBota() {
		
		Bota b = new Bota("1234", 12.4, 42, Cania.Baja);
		
		assertEquals(42, b.getTalle());
	
	}
	
	
	@Test
	void getCania_botaConCania_caniaBota() {
		
		Bota b = new Bota("1234", 12.4, 42, Cania.Baja);
		
		assertEquals("Baja", ((Bota)b).getCania());
	
	}
	
}
