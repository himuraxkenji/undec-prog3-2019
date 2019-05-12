package excepciones;

public class AerolineaNombreIncompletoException extends AerolineaMalFormadaException{

	public AerolineaNombreIncompletoException() {
		super("Falta nombre de aerolinea");
	}

}
