package aeropuerto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import excepciones.AerolineaMalFormadaException;
import excepciones.AerolineaNombreIncompletoException;

class AerolineaUnitTest {

	@Test
	public void instanciarAerolinea_TodosLosAtributos_InstanciaCorrecta() {
		Aerolinea unaAerolinea = null;
		try {
			unaAerolinea = new Aerolinea(1, "Flybondy");
		} catch (AerolineaMalFormadaException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();		
		}
		
		assertEquals(1, unaAerolinea.getId());
		assertEquals("Flybondy", unaAerolinea.getNombre());
	}
	
	@Test
	public void instanciarAerolinea_FaltaNombre_InstanciaIncorrecta() {
		Assertions.assertThrows(AerolineaNombreIncompletoException.class, ()->{
			Aerolinea unaAerolinea = new Aerolinea(1,"");
		});
		
	}
	
	@Test
	public void ModificarAerolineaNombre_TodosLosAtributos_InstanciaCorrecta() {
		Aerolinea unaAerolinea = null;
		try { 
			unaAerolinea = new Aerolinea(1, "Flybondy");
		} catch (AerolineaMalFormadaException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();		
		}
		
		unaAerolinea.setNombre("AerolineasArgentinas");
		
		assertEquals("AerolineasArgentinas", unaAerolinea.getNombre());
		
	}

}
