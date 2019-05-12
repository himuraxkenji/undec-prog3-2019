package excepciones;

public class AeropuertoNombreIncompletoException extends AerolineaMalFormadaException{

	public AeropuertoNombreIncompletoException() {
		super("Falta nombre de Aeropuerto");
	}

}
