package excepciones;

public class VueloCodigoIncompletoException extends VueloMalFormadoException{

	public VueloCodigoIncompletoException() {
		super("Falta el codigo del vuelo");
	}

}
