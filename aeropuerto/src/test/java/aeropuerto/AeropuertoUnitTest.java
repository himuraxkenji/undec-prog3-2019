package aeropuerto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AeropuertoUnitTest {

	@Test
	public void instanciarAeropuerto_TodosLosAtributos_InstanciaCorrecta() {
		Ciudad  unaCiudad = new Ciudad(1, "Buenos Aires");
		Aeropuerto unAeropuerto = new Aeropuerto(1, "Ezeiza", unaCiudad, "eze1234");
		
		assertEquals(1, unAeropuerto.getId());
		assertEquals("Ezeiza", unAeropuerto.getNombre());
		assertEquals(unaCiudad, unAeropuerto.getCiudad());
		assertEquals("eze1234", unAeropuerto.getCodigo());	
	}
	
	@Test
	public void instanciarAeropuerto_FaltaIdAeropuerto_IdCiudadIncompletoException() {
		Ciudad  unaCiudad = new Ciudad(1, "Buenos Aires");
		
		Assertions.assertThrows(IdAeropuertoIncompletoException.class, ()->{
			Aeropuerto unAeropuerto = new Aeropuerto("Ezeiza", unaCiudad, "eze1234");
		});
		
	}
	
	@Test
	public void instanciarAeropuerto_FaltaNombreAeropuerto_NombreAeropuertoIncompletoException() {
		Ciudad  unaCiudad = new Ciudad(1, "Buenos Aires");
		Assertions.assertThrows(NombreAeropuertoIncompletoException.class, ()->{
			Aeropuerto unAeropuerto = new Aeropuerto(1, "", unaCiudad, "eze1234");
		});
		
	}
	
	@Test
	public void instanciarAeropuerto_FaltaCiudadAeropuerto_CiudadIncompletaException() {
		Ciudad  unaCiudad = new Ciudad(1, "Buenos Aires");
		Assertions.assertThrows(CiudadAeropuertoIncompletaException.class, ()->{
			Aeropuerto unAeropuerto = new Aeropuerto(1, "", null, "eze1234");
		});
		
	}
	
	@Test
	public void modificarNombreAeropuerto_TodosLosAtributos_InstanciaCorrecta() {
		Ciudad  unaCiudad = new Ciudad(1, "Buenos Aires");
		Aeropuerto unAeropuerto = new Aeropuerto(1, "Ezeiza", unaCiudad, "eze1234");
		
		unAeropuerto.setNombre("La Rioja");
		
		assertEquals("La Rioja", unAeropuerto.getNombre());
	}
	
	@Test
	public void modificarCodigo_TodosLosAtributos_InstanciaCorrecta() {
		Ciudad  unaCiudad = new Ciudad(1, "Buenos Aires");
		Aeropuerto unAeropuerto = new Aeropuerto(1, "Ezeiza", unaCiudad, "eze1234");
		
		unAeropuerto.setCodigo("eze1994");
		
		assertEquals("eze1994", unAeropuerto.getCodigo());
	}
	
}
