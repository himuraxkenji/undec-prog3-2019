package aeropuerto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CiudadUnitTest {
	
	@Test
	public void instanciarCiudad_TodosLosAtributos_InstanciaCorrecta() {
		Ciudad unaCiudad = new Ciudad(1, "Chilecito", "5360" );
		
		assertEquals(1, unaCiudad.getId());
		assertEquals("Chilecito", unaCiudad.getNombre());
		assertEquals("5360", unaCiudad.getCodigoPostal());
	}
	
	@Test
	public void instanciarCiudad_FaltaCodigoPostal_InstanciaCorrecta() {
		Ciudad unaCiudad = new Ciudad(1, "Chilecito", "");
		
		assertEquals("Chilecito", unaCiudad.getNombre());
		assertEquals("", unaCiudad.getCodigoPostal());
	}
	
	@Test
	public void instanciarCiudad_FaltaNombreCiudad_NombreCiudadIncompletaException() {
		 Assertions.assertThrows(NombreCiudadIncompletaException.class, ()->{
			Ciudad unaCiudad = new Ciudad(1, "", "5360");
		});
		
	}
	
	@Test
	public void instanciarCiudad_FaltaIdCiudad_IdCiudadIncompletaException() {
		 Assertions.assertThrows(IdCiudadIncompletaException.class, ()->{
			Ciudad unaCiudad = new Ciudad("", "5360");
		});
	}
	
	@Test
	public void ModificarNombreCiudad_TodosLosAtributos_InstanciaCorrecta() {
		Ciudad unaCiudad = new Ciudad(1, "Chilecito", "5360" );
		
		unaCiudad.setCiudad("Famatina");		
		assertEquals("Famatina", unaCiudad.getNombre());
	}

}
