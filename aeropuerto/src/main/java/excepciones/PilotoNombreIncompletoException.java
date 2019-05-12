package excepciones;

public class PilotoNombreIncompletoException extends PilotoMalFormadoException{

	public PilotoNombreIncompletoException() {
		super("Falta nombres del piloto");
	}

}
