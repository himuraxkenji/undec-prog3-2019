package excepciones;

public class PasajeroApellidoIncompletoException extends PasajeroMalFormadoException{

	public PasajeroApellidoIncompletoException() {
		super("Falta Apellido del Pasajero");
	}

}
