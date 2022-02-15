package com.zenvia.technicalchallenge.constants;

public enum ErrorCodes {

    BAD_REQUEST("Bad Request"),
    VALIDATION_FAILED("Validation failed"),
    INTERNAL_SERVER_ERROR("Internal server error");

    private final String message;

    ErrorCodes(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
