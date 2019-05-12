package excepciones;

public class PilotoDNIIncompletoException extends PilotoMalFormadoException{

	public PilotoDNIIncompletoException() {
		super("Falta D.N.I del piloto");
	}

}
