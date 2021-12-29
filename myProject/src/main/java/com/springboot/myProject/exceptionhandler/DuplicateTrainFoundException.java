package com.springboot.myProject.exceptionhandler;

public class DuplicateTrainFoundException extends RuntimeException{

    public DuplicateTrainFoundException(String message) {
        super(message);
    }

    public DuplicateTrainFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public DuplicateTrainFoundException(Throwable cause) {
        super(cause);
    }
}
