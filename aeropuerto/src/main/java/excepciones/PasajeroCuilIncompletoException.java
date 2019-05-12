package excepciones;

public class PasajeroCuilIncompletoException extends PasajeroMalFormadoException{

	public PasajeroCuilIncompletoException() {
		super("Falta Numero de Cuil del Pasajero");
	}

}
