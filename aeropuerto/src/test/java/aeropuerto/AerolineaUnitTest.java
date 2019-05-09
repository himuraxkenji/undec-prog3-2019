package aeropuerto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AerolineaUnitTest {

	@Test
	public void instanciarAerolinea_TodosLosAtributos_InstanciaCorrecta() {
		Aerolinea unaAerolinea = new Aerolinea(1, "Flybondy");
		
		assertEquals(1, unaAerolinea.getId());
		assertEquals("Flybondy", unaAerolinea.getNombre());
	}
	
	@Test
	public void instanciarAerolinea_FaltaNombre_InstanciaIncorrecta() {
		Assertions.assertThrows(IdAerolineaIncompletaException.class, ()->{
			Aerolinea unaAerolinea = new Aerolinea(1,"eze1234");
		});
		
	}
	
	@Test
	public void ModificarAerolineaNombre_TodosLosAtributos_InstanciaCorrecta() {
		Aerolinea unaAerolinea = new Aerolinea(1, "Flybondy");
		
		unaAerolinea.setNombre("AerolineasArgentinas");
		
		assertEquals("AerolineasArgentinas", unaAerolinea.getNombre());
		
	}

}
