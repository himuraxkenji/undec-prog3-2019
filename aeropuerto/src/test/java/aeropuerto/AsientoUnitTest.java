package aeropuerto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AsientoUnitTest {

	@Test
	public void instanciarAsiento_TodosLosAtributos_InstanciaCorrecta() {
		Asiento unAsiento = new Asiento(1, "001"); 
		
		assertEquals(1, unAsiento.getId());
		assertEquals("001", unAsiento.getNroAsiento());
	}
	
	@Test
	public void instanciarAsiento_FaltaNumeroAsiento_NumeroAsientoIncompletoException() {
		Asiento unAsiento = new Asiento(1, "001"); 
		
		assertEquals(1, unAsiento.getId());
		assertEquals("001", unAsiento.getNroAsiento());
	}
	
	@Test
	public void ModificarNumeroAsiento_TodosLosAtributos_InstanciaCorrecta() {
		Asiento unAsiento = new Asiento(1, "001"); 
		
		unAsiento.setNroAsiento("002");
		
		assertEquals("002", unAsiento.getNroAsiento());
	}
	
}
