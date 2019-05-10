package aeropuerto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PasajeroUnitTest {

	@Test
	public void instanciarPasajero_TodosLosAtributos_InstanciaCorrecta() {
		Pasajero unPasajero = new Pasajero(1, "20384407618", "Riperto", "Adriel", "3825574945" ); 
		
		assertEquals(1, unPasajero.getId());
		assertEquals("20-38.440.761-8", unPasajero.getCuil());
		assertEquals("Riperto", unPasajero.getApellido());
		assertEquals("Adriel", unPasajero.getNombre());
		assertEquals("3825574945", unPasajero.getTelefono());
	}
	
	@Test
	public void instanciarPasajero_FaltaTelefono_InstanciaCorrecta() {
		Pasajero unPasajero = new Pasajero(1, "20384407618", "Riperto", "Adriel" ); 
		assertEquals(1, unPasajero.getId());
		assertEquals("20-38.440.761-8", unPasajero.getCuil());
		assertEquals("Riperto", unPasajero.getApellido());
		assertEquals("Adriel", unPasajero.getNombre());
		assertEquals("No Cargado", unPasajero.getTelefono());
	}
	
	@Test
	public void instanciarPasajero_FaltaCuil_CuilPasajeroIncompletoException() {
		
		Assertions.assertThrows(CuilPasajeroIncompletoException.class, ()->{
			Pasajero unPasajero = new Pasajero(1, "", "Riperto", "Adriel" ); 
		});
	}
	
	@Test
	public void instanciarPasajero_FaltaApellido_ApellidoPasajeroIncompletoException() {
		
		Assertions.assertThrows(CuilPasajeroIncompletoException.class, ()->{
			Pasajero unPasajero = new Pasajero(1, "2038440761", "", "Adriel" ); 
		});
	}
	
	@Test
	public void instanciarPasajero_FaltaNombre_NombrePasajeroIncompletoException() {
		
		Assertions.assertThrows(CuilPasajeroIncompletoException.class, ()->{
			Pasajero unPasajero = new Pasajero(1, "2038440761", "Riperto", "" ); 
		});
	}
	
	@Test
	public void ModificarCuilPasajero_FaltaTelefono_CambioCorrecto() {
		Pasajero unPasajero = new Pasajero(1, "20384407618", "Riperto", "Adriel" ); 
		
		unPasajero.setCuil("20330060038");
		
		assertEquals("20-33.006.003-8", unPasajero.getCuil());
	}
	
	@Test
	public void ModificarApellidoPasajero_FaltaTelefono_CambioCorrecto() {
		Pasajero unPasajero = new Pasajero(1, "20384407618", "Riperto", "Adriel" ); 
		
		unPasajero.setApellido("Alamo");
		
		assertEquals("Alamo", unPasajero.getApellido());
	}
	
	@Test
	public void ModificarNombrePasajero_FaltaTelefono_CambioCorrecto() {
		Pasajero unPasajero = new Pasajero(1, "20384407618", "Riperto", "Adriel" ); 
		
		unPasajero.setNombre("Pedro");
		
		assertEquals("Pedro", unPasajero.getNombre());
	}
	
	@Test
	public void ModificarTelefonoPasajero_FaltaTelefono_CambioCorrecto() {
		Pasajero unPasajero = new Pasajero(1, "20384407618", "Riperto", "Adriel" ); 
		
		
		unPasajero.setTelefono("3825654793");
		
		assertEquals("3825654793", unPasajero.getTelefono());
	}
	
}
