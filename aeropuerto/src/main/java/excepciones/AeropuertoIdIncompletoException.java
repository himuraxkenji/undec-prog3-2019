package excepciones;

public class AeropuertoIdIncompletoException extends AerolineaMalFormadaException{

	public AeropuertoIdIncompletoException() {
		super("Falta Id de Aeropuerto");
	}

}
