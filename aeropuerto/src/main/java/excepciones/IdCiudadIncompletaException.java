package excepciones;

public class IdCiudadIncompletaException extends CiudadMalFormadaException{

	public IdCiudadIncompletaException( ) {
		super("Falta id Ciudad");
	}

}
