package aeropuerto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import excepciones.*;
class PasajeroUnitTest {

	@Test
	public void instanciarPasajero_TodosLosAtributos_InstanciaCorrecta() {
		
		Pasajero unPasajero = null;
		
		try {
			unPasajero = new Pasajero(1, "20384407618", "Riperto", "Adriel", "3825574945" ); 
		}catch(PasajeroMalFormadoException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		assertEquals(1, unPasajero.getId());
		assertEquals("20384407618", unPasajero.getCuil());
		assertEquals("Riperto", unPasajero.getApellido());
		assertEquals("Adriel", unPasajero.getNombre());
		assertEquals("3825574945", unPasajero.getTelefono());
	}
	
	@Test
	public void instanciarPasajero_FaltaTelefono_InstanciaCorrecta() {
		Pasajero unPasajero = null;
		
		try {
			unPasajero = new Pasajero(1, "20384407618", "Riperto", "Adriel" ); 
		}catch(PasajeroMalFormadoException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(1, unPasajero.getId());
		assertEquals("20384407618", unPasajero.getCuil());
		assertEquals("Riperto", unPasajero.getApellido());
		assertEquals("Adriel", unPasajero.getNombre());
		assertEquals("No Cargado", unPasajero.getTelefono());
	}
	
	@Test
	public void instanciarPasajero_FaltaCuil_CuilPasajeroIncompletoException() {
		
		Assertions.assertThrows(PasajeroCuilIncompletoException.class, ()->{
			Pasajero unPasajero = new Pasajero(1, "", "Riperto", "Adriel" ); 
		});
	}
	
	@Test
	public void instanciarPasajero_FaltaApellido_ApellidoPasajeroIncompletoException() {
		
		Assertions.assertThrows(PasajeroApellidoIncompletoException.class, ()->{
			Pasajero unPasajero = new Pasajero(1, "2038440761", "", "Adriel" ); 
		});
	}
	
	@Test
	public void instanciarPasajero_FaltaNombre_NombrePasajeroIncompletoException() {
		
		Assertions.assertThrows(PasajeroNombreIncompletoException.class, ()->{
			Pasajero unPasajero = new Pasajero(1, "2038440761", "Riperto", "" ); 
		});
	}
	
	@Test
	public void ModificarCuilPasajero_FaltaTelefono_CambioCorrecto() {
		Pasajero unPasajero = null;
		
		try {
			unPasajero = new Pasajero(1, "20384407618", "Riperto", "Adriel" ); 
		}catch(PasajeroMalFormadoException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		unPasajero.setCuil("20330060038");
		assertEquals("20330060038", unPasajero.getCuil());
	}
	
	@Test
	public void ModificarApellidoPasajero_FaltaTelefono_CambioCorrecto() {
		Pasajero unPasajero = null;
		
		try {
			unPasajero = new Pasajero(1, "20384407618", "Riperto", "Adriel" ); 
		}catch(PasajeroMalFormadoException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		unPasajero.setApellido("Alamo");
		
		assertEquals("Alamo", unPasajero.getApellido());
	}
	
	@Test
	public void ModificarNombrePasajero_FaltaTelefono_CambioCorrecto() {
		Pasajero unPasajero = null;
		
		try {
			unPasajero = new Pasajero(1, "20384407618", "Riperto", "Adriel" ); 
		}catch(PasajeroMalFormadoException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		unPasajero.setNombre("Pedro");
		
		assertEquals("Pedro", unPasajero.getNombre());
	}
	
	@Test
	public void ModificarTelefonoPasajero_FaltaTelefono_CambioCorrecto() {
		Pasajero unPasajero = null;
		
		try {
			unPasajero = new Pasajero(1, "20384407618", "Riperto", "Adriel" ); 
		}catch(PasajeroMalFormadoException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		unPasajero.setTelefono("3825654793");
		
		assertEquals("3825654793", unPasajero.getTelefono());
	}
	
}
