package excepciones;

public class PilotoApellidoIncompletoException extends PilotoMalFormadoException{

	public PilotoApellidoIncompletoException() {
		super("Falta Apellidos del piloto");
	}

}
