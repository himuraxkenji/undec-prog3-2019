package aeropuerto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import excepciones.AsientoMalFormadoException;
import excepciones.AsientoNumeroIncompletoException;

class AsientoUnitTest {

	@Test
	public void instanciarAsiento_TodosLosAtributos_InstanciaCorrecta() {
		
		Asiento unAsiento = null;
		try {
			unAsiento = new Asiento(1, "001"); 
		}catch (AsientoMalFormadoException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(1, unAsiento.getId());
		assertEquals("001", unAsiento.getNroAsiento());
	}
	
	@Test
	public void instanciarAsiento_FaltaNumeroAsiento_NumeroAsientoIncompletoException() {
		 
		Assertions.assertThrows(AsientoNumeroIncompletoException.class, ()->{
			Asiento unAsiento = new Asiento(1, "");
		});
	}
	
	@Test
	public void ModificarNumeroAsiento_TodosLosAtributos_InstanciaCorrecta() {
		Asiento unAsiento = null;
		try {
			unAsiento = new Asiento(1, "001");
		} catch (AsientoMalFormadoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		unAsiento.setNroAsiento("002");
		
		assertEquals("002", unAsiento.getNroAsiento());
	}
	
}
