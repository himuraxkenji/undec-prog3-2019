package excepciones;

public class AsientoNumeroIncompletoException  extends AsientoMalFormadoException{

	public AsientoNumeroIncompletoException() {
		super("Falta numero de asiento.");
	}

}
