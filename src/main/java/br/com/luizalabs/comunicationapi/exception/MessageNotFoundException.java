package br.com.luizalabs.comunicationapi.exception;

public class MessageNotFoundException extends RuntimeException {

    public MessageNotFoundException(String message) {
        super(message);
    }
}
