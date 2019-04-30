package aeropuerto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CiudadUnitTest {

	public void instanciarCiudad_TodosLosAtributos_InstanciaCorrecta() {
		//arrange y act
		Ciudad unaCiudad = new Ciudad(1, "Chilecito", "5360" );
		
		//assert
		assertEquals(1, unaCiudad.getId());
		assertEquals("Chilecito", unaCiudad.getNombre());
		assertEquals("5360", unaCiudad.getCodigoPostal());
	}
	
	public void instanciarCiudad_FaltaCodigoPostal_InstanciaCorrecta() {
		//arrange y act
		Ciudad unaCiudad = new Ciudad(1, "Chilecito", "");
		
		//assert
		assertEquals("Chilecito", unaCiudad.getNombre());
		assertEquals("", unaCiudad.getCodigoPostal());
	}
	
	public void instanciarCiudad_FaltaNombreCiudad_NombreCiudadIncompletaException() {
		//arrange, act y assert
		 Assertions.assertThrows(NombreCiudadIncompletaException.class, ()->{
			Ciudad unaCiudad = new Ciudad(1, "", "5360");
		});
		
	}
	
	public void instanciarCiudad_FaltaIdCiudad_IdCiudadIncompletaException() {
		//arrange, act y assert
		 Assertions.assertThrows(IdCiudadIncompletaException.class, ()->{
			Ciudad unaCiudad = new Ciudad("", "5360");
		});
	}

}
