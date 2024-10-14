package com.logonedigital.gestionmagasin.Magasins;

public class PrixNegatifException extends Exception{
    public PrixNegatifException() {

    }
    public PrixNegatifException(String message) {
        super(message);
    }
}
