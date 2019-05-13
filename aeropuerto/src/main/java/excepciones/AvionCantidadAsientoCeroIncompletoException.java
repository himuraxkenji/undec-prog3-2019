package excepciones;

public class AvionCantidadAsientoCeroIncompletoException extends AvionMalFormadoException {

	public AvionCantidadAsientoCeroIncompletoException() {
		super("La cantidad de asientos debe ser mayor a cero.");
	}

}
