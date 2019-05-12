package aeropuerto;

import excepciones.AsientoMalFormadoException;
import excepciones.AsignacionCodigoIncompletoException;

public class Asignacion {
	
	private String codigoAsignacion;
	private Pasajero unPasajero = null;
	private Asiento unAsiento = null;
	
	public Asignacion(Pasajero unPasajero, Asiento unAsiento, String codigoAsignacion) throws AsientoMalFormadoException{
		if (codigoAsignacion.length() == 0) 
			throw new AsignacionCodigoIncompletoException();
		
		this.codigoAsignacion = codigoAsignacion;
		this.unPasajero = unPasajero;
		this.unAsiento = unAsiento;
			
	}

	public String getCodigoAsignacion() {
		return this.codigoAsignacion;
	}

}
