package excepciones;

public class ClienteIncompletoException extends Exception {
    public ClienteIncompletoException() {
        super("Cliente Incompleto Exception: Nro de Doc incompleto");
    }
}
