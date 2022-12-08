package com.programming.techie.springngblog.exception;

@SuppressWarnings("serial")
public class PostNotFoundException extends RuntimeException {
    public PostNotFoundException(String message) {
        super(message);
    }
}
