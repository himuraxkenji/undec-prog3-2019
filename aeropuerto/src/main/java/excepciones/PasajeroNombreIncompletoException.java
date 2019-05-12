package excepciones;

public class PasajeroNombreIncompletoException extends PasajeroMalFormadoException{

	public PasajeroNombreIncompletoException() {
		super("Falta Nombre del Pasajero");
	}

}
