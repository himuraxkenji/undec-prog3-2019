package aeropuerto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import excepciones.CiudadMalFormadaException;
import excepciones.IdCiudadIncompletaException;
import excepciones.NombreCiudadIncompletaException;

class CiudadUnitTest {
	
	@Test
	public void instanciarCiudad_TodosLosAtributos_InstanciaCorrecta() {
		Ciudad unaCiudad = null;
		try {
			unaCiudad = new Ciudad(1, "Chilecito", "5360" );
		}catch (CiudadMalFormadaException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(1, unaCiudad.getIdCiudad());
		assertEquals("Chilecito", unaCiudad.getNombre());
		assertEquals("5360", unaCiudad.getCodigoPostal());
	}
	
	@Test
	public void instanciarCiudad_FaltaCodigoPostal_InstanciaCorrecta() {
		
		Ciudad unaCiudad = null;
		
		try {
			unaCiudad = new Ciudad(1, "Chilecito");
		}catch (CiudadMalFormadaException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		assertEquals("Chilecito", unaCiudad.getNombre());
		assertEquals("No cargado", unaCiudad.getCodigoPostal());
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
			Ciudad unaCiudad = new Ciudad(0, "Chilecito", "5360");
		});
	}
	
	@Test
	public void ModificarNombreCiudad_TodosLosAtributos_InstanciaCorrecta() {
		Ciudad unaCiudad = null;
		try {
			unaCiudad = new Ciudad(1, "Chilecito", "5360" );
		}catch (CiudadMalFormadaException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		unaCiudad.setCiudad("Famatina");		
		assertEquals("Famatina", unaCiudad.getNombre());
	}

}
