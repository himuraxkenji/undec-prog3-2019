package excepciones;

public class AeropuertoCiudadIncompletaException extends AerolineaMalFormadaException {

	public AeropuertoCiudadIncompletaException() {
		super("Falta ciudad del Aeropuerto");
	}

}
