package aeropuerto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AeropuertoUnitTest {

	@Test
	public void instanciarAeropuerto_TodosLosAtributos_InstanciaCorrecta() {
		//arrange y act
		Ciudad  unaCiudad = new Ciudad(1, "Buenos Aires");
		Aeropuerto unAeropuerto = new Aeropuerto(1, "Ezeiza", unaCiudad, "eze1234");
		
		//assert
		assertEquals(1, unAeropuerto.getId());
		assertEquals("Ezeiza", unAeropuerto.getNombre());
		assertEquals(unaCiudad, unAeropuerto.getCiudad());
		assertEquals("eze1234", unAeropuerto.getCodigo());	
	}
	
	@Test
	public void instanciarAeropuerto_FaltaIdAeropuerto_IdCiudadIncompletoException() {
		//arrange y act
		Ciudad  unaCiudad = new Ciudad(1, "Buenos Aires");
		
		
		//assert
		Assertions.assertThrows(IdAeropuertoIncompletoException.class, ()->{
			Aeropuerto unAeropuerto = new Aeropuerto("Ezeiza", unaCiudad, "eze1234");
		});
		
	}
	
	@Test
	public void instanciarAeropuerto_FaltaNombreAeropuerto_NombreAeropuertoIncompletoException() {
		//arrange y act
		Ciudad  unaCiudad = new Ciudad(1, "Buenos Aires");
		//assert
		Assertions.assertThrows(NombreAeropuertoIncompletoException.class, ()->{
			Aeropuerto unAeropuerto = new Aeropuerto(1, "", unaCiudad, "eze1234");
		});
		
	}
	
	@Test
	public void instanciarAeropuerto_FaltaCiudadAeropuerto_CiudadIncompletaException() {
		//arrange y act
		Ciudad  unaCiudad = new Ciudad(1, "Buenos Aires");
		//assert
		Assertions.assertThrows(CiudadAeropuertoIncompletaException.class, ()->{
			Aeropuerto unAeropuerto = new Aeropuerto(1, "", null, "eze1234");
		});
		
	}
	
	
}
