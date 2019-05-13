package aeropuerto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import excepciones.*;

class AsignacionUnitTest {

	@Test
	public void instanciarAsignación_TodosLosAtributos_InstanciaCorrecta() {
		Pasajero unPasajero = null;
		try {
			unPasajero = new Pasajero(1, "20384407618", "Riperto", "Adriel", "3825574945" );
		} catch (PasajeroMalFormadoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		Asiento unAsiento= null;
		try { 
			unAsiento = new Asiento(1, "001");
		} catch (AsientoMalFormadoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
		Asignacion unaAsignacion = null;
		try {
			unaAsignacion = new Asignacion(unPasajero, unAsiento,"001-RA");
		} catch (AsientoMalFormadoException e) {
			e.printStackTrace();
		}
		
		assertEquals("001-RA", unaAsignacion.getCodigoAsignacion());
		assertEquals("Riperto", unaAsignacion.getPasajero().getApellido());
		assertEquals("001", unaAsignacion.getAsiento().getNroAsiento());
	}
	
	@Test
	public void instanciarAsiento_FaltaCodigoAsiento_AsignacionCodigoIncompletoException() {
		
		Assertions.assertThrows(AsignacionCodigoIncompletoException.class, ()->{
			Pasajero unPasajero = null;
			try {
				unPasajero = new Pasajero(1, "20384407618", "Riperto", "Adriel", "3825574945" );
			} catch (PasajeroMalFormadoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			Asiento unAsiento= null;
			try { 
				unAsiento = new Asiento(1, "001");
			} catch (AsientoMalFormadoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 		
			Asignacion unaAsignacion = new Asignacion(unPasajero, unAsiento,"");
		});
	}
	
	@Test
	public void modificarPasajeroAsignación_TodosLosAtributos_AsignacionModificada() {
		Pasajero unPasajero = null;
		try {
			unPasajero = new Pasajero(1, "20384407618", "Riperto", "Adriel", "3825574945" );
		} catch (PasajeroMalFormadoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		Asiento unAsiento= null;
		try { 
			unAsiento = new Asiento(1, "001");
		} catch (AsientoMalFormadoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
		Asignacion unaAsignacion = null;
		try {
			unaAsignacion = new Asignacion(unPasajero, unAsiento,"001-RA");
		} catch (AsientoMalFormadoException e) {
			e.printStackTrace();
		}
		unPasajero.setApellido("Robles");
		unaAsignacion.setPasajero(unPasajero);
		assertEquals("Robles", unaAsignacion.getPasajero().getApellido());
	}
	
	@Test
	public void modificarAsientoAsignación_TodosLosAtributos_AsignacionModificada() {
		Pasajero unPasajero = null;
		try {
			unPasajero = new Pasajero(1, "20384407618", "Riperto", "Adriel", "3825574945" );
		} catch (PasajeroMalFormadoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		Asiento unAsiento= null;
		try { 
			unAsiento = new Asiento(1, "001");
		} catch (AsientoMalFormadoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
		Asignacion unaAsignacion = null;
		try {
			unaAsignacion = new Asignacion(unPasajero, unAsiento,"001-RA");
		} catch (AsientoMalFormadoException e) {
			e.printStackTrace();
		}
		unAsiento.setNroAsiento("002");
		unaAsignacion.setPasajero(unPasajero);
		assertEquals("002", unaAsignacion.getAsiento().getNroAsiento());
	}
}
