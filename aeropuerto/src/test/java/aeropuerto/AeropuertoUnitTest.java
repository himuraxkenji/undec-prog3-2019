package aeropuerto;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import excepciones.AerolineaMalFormadaException;
import excepciones.AeropuertoCiudadIncompletaException;
import excepciones.AeropuertoIdIncompletoException;
import excepciones.AeropuertoNombreIncompletoException;
import excepciones.CiudadMalFormadaException;

class AeropuertoUnitTest {

	@Test
	public void instanciarAeropuerto_TodosLosAtributos_InstanciaCorrecta() {
		Ciudad unaCiudad = null;
		try {
			unaCiudad = new Ciudad(1, "Buenos Aires");
		} catch (CiudadMalFormadaException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Aeropuerto unAeropuerto = null;
		try {
			unAeropuerto = new Aeropuerto(1, "Ezeiza", unaCiudad, "eze1234");
		} catch (AerolineaMalFormadaException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		assertEquals(1, unAeropuerto.getId());
		assertEquals("Ezeiza", unAeropuerto.getNombre());
		assertEquals(unaCiudad, unAeropuerto.getCiudad());
		assertEquals("eze1234", unAeropuerto.getCodigoAeropuerto());	
	}
	
	@Test
	public void instanciarAeropuerto_FaltaIdAeropuerto_IdCiudadIncompletoException() {
		
		Assertions.assertThrows(AeropuertoIdIncompletoException.class, ()->{
			Ciudad unaCiudad = null;
			try {
				unaCiudad = new Ciudad(1, "Buenos Aires");
			} catch (CiudadMalFormadaException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			Aeropuerto unAeropuerto = new Aeropuerto(0,"Ezeiza", unaCiudad, "eze1234");
		});
		
	}
	
	@Test
	public void instanciarAeropuerto_FaltaNombreAeropuerto_NombreAeropuertoIncompletoException() {
		Assertions.assertThrows(AeropuertoNombreIncompletoException.class, ()->{
			Ciudad unaCiudad = null;
			try {
				unaCiudad = new Ciudad(1, "Buenos Aires");
			} catch (CiudadMalFormadaException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			Aeropuerto unAeropuerto = new Aeropuerto(1, "", unaCiudad, "eze1234");
		});
		
	}
	
	@Test
	public void instanciarAeropuerto_FaltaCiudadAeropuerto_CiudadIncompletaException() {
		Assertions.assertThrows(AeropuertoCiudadIncompletaException.class, ()->{
			Aeropuerto unAeropuerto = new Aeropuerto(1, "Ezeiza", null, "eze1234");
		});
		
	}
	
	@Test
	public void modificarNombreAeropuerto_TodosLosAtributos_InstanciaCorrecta() {
		Ciudad unaCiudad = null;
		try {
			unaCiudad = new Ciudad(1, "Buenos Aires");
		} catch (CiudadMalFormadaException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Aeropuerto unAeropuerto = null;
		try {
			unAeropuerto = new Aeropuerto(1, "Ezeiza", unaCiudad, "eze1234");
		} catch (AerolineaMalFormadaException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		unAeropuerto.setNombre("La Rioja");
		
		assertEquals("La Rioja", unAeropuerto.getNombre());
	}
	
	@Test
	public void modificarCodigo_TodosLosAtributos_InstanciaCorrecta() {
		Ciudad unaCiudad = null;
		try {
			unaCiudad = new Ciudad(1, "Buenos Aires");
		} catch (CiudadMalFormadaException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Aeropuerto unAeropuerto = null;
		try {
			unAeropuerto = new Aeropuerto(1, "Ezeiza", unaCiudad, "eze1234");
		} catch (AerolineaMalFormadaException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		unAeropuerto.setCodigoAeropuerto("eze1994");
		
		assertEquals("eze1994", unAeropuerto.getCodigoAeropuerto());
	}
	
}
