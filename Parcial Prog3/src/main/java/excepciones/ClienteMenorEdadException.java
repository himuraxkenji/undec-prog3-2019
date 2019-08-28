package excepciones;

public class ClienteMenorEdadException extends Exception {
    public ClienteMenorEdadException() {
        super("Cliente Incompleto Exception: Nro de Doc incompleto");
    }
}
