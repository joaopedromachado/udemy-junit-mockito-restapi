package br.com.restapi.service.expcetion;

public class DataIntegratyViolationException extends RuntimeException {
    private static final String msg = "E-mail já existente.";

    public DataIntegratyViolationException() {
        super(msg);
    }
}
