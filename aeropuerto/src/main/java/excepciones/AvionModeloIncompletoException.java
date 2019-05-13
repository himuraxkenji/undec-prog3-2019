package excepciones;

public class AvionModeloIncompletoException extends AvionMalFormadoException{

	public AvionModeloIncompletoException() {
		super("Falta Modelo de avion");
	}

}
