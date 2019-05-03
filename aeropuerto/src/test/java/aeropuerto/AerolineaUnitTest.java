package aeropuerto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AerolineaUnitTest {

	@Test
	public void instanciarAerolinea_TodosLosAtributos_InstanciaCorrecta() {
		//arrange y act
		Aerolinea unaAerolinea = new Aerolinea(1, "Flybondy");
		
		//assert
		assertEquals(1, unaAerolinea.getId());
		assertEquals("Flybondy", unaAerolinea.getNombre());
	}
	
	@Test
	public void instanciarAerolinea_FaltaNombre_InstanciaIncorrecta() {
		//arrange y act
		//assert
		Assertions.assertThrows(IdAerolineaIncompletaException.class, ()->{
			Aerolinea unaAerolinea = new Aerolinea(1,"eze1234");
		});
		
	}

}
