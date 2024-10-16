package exception;

public class PrixNegatifException extends RuntimeException{
    public PrixNegatifException(String message) {
        super(message);
    }
}
