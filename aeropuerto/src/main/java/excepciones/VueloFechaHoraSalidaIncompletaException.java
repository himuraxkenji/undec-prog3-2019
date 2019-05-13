package excepciones;

public class VueloFechaHoraSalidaIncompletaException extends VueloMalFormadoException{

	public VueloFechaHoraSalidaIncompletaException() {
		super("Falta fecha y hora de salida del vuelo");
	}

}
