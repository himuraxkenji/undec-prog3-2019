package excepciones;

public class ClienteExisteException extends Exception {
    public ClienteExisteException(String mgs){
        super(mgs);
    }
}
