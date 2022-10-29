package com.bridgelabz.user_registration;

public class UserRegistrationException extends Exception {
    String message;
    public static ExceptionType type;

    public enum ExceptionType {
        NULL, EMPTY;
    }

    public UserRegistrationException(ExceptionType type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
