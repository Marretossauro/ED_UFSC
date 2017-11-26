package model;

public class ValorInvalidoException extends Exception {

    private static final String message = "Valor inválido";

    public ValorInvalidoException() {
        super(message);
    }

}
