package br.com.iasfix.model.exception;

import org.springframework.data.crossstore.ChangeSetPersister;

public class MyNotFoundException extends RuntimeException {
    public MyNotFoundException(String msg) {
        super(msg);
    }
}
