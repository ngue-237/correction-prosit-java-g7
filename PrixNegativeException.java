package logonedigital.gestionmagasin.model;

public class PrixNegativeException extends RuntimeException{
    public PrixNegativeException(String message) {
    super(message);
}
}
