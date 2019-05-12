package excepciones;

public class AsignacionCodigoIncompletoException extends AsientoMalFormadoException{

	public AsignacionCodigoIncompletoException() {
		super("Falta codigo de asignación");
	}

}
