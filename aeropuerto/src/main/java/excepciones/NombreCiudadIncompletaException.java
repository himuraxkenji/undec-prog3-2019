package excepciones;

public class NombreCiudadIncompletaException extends CiudadMalFormadaException{

	public NombreCiudadIncompletaException( ) {
		super("Falta Nombre Ciudad");
	}

}
