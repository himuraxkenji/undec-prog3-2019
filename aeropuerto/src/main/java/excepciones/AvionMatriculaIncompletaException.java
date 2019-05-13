package excepciones;

public class AvionMatriculaIncompletaException extends AvionMalFormadoException{

	public AvionMatriculaIncompletaException() {
		super("Falta matricula de avion");
	}

}
