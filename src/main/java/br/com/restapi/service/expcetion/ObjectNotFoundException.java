package br.com.restapi.service.expcetion;

public class ObjectNotFoundException extends RuntimeException {
    private static final String msg = "Não foi encontrado.";
    public ObjectNotFoundException() {
        super(msg);
    }
}
