package aeropuerto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AsignacionUnitTest {

	@Test
	public void instanciarAsignación_TodosLosAtributos_InstanciaCorrecta() {
		Pasajero unPasajero = new Pasajero(1, "20384407618", "Riperto", "Adriel", "3825574945" ); 
		Asiento unAsiento = new Asiento(1, "001"); 		
		Asignacion unaAsignacion = new Asignacion(unPasajero, unAsiento);
		
		assertEquals("001-RA", unaAsignacion.getCodigoAsignacion());
	}
}
