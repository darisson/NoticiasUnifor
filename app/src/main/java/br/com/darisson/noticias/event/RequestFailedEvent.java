package br.com.darisson.noticias.event;

public class RequestFailedEvent {

    private Integer err_message;
    private String message;
    private boolean defaultError;
    public RequestFailedEvent(String message, boolean defaultError, Integer err_message) {
        this.err_message = err_message;
        this.message = message;
        this.defaultError = defaultError;
    }

    public Integer getErr_message() {
        return err_message;
    }

    public String getMessage() {
        return message;
    }

    public boolean isDefaultError() {
        return defaultError;
    }
}
