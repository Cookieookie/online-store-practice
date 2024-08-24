package com.javamaster.Exception;

import org.springframework.data.crossstore.ChangeSetPersister;

public class NotFoundException extends Exception {

    public NotFoundException(String message) {
        super(message);
    }
}
