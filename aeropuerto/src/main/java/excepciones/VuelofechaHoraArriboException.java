package excepciones;

public class VuelofechaHoraArriboException extends VueloMalFormadoException{

	public VuelofechaHoraArriboException() {
		super("Falta Fecho y Hora de Arribo del vuelo");
	}

}
