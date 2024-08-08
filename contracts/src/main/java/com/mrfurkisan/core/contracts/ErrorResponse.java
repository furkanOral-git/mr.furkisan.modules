package com.mrfurkisan.core.contracts;

import com.mrfurkisan.core.requests.Response;

public class ErrorResponse extends Response {

    public ErrorResponse(String message) {

        super(false, message);

    }

    public ErrorResponse(Exception ex) {

        this(ex.getMessage());
    }

    public ErrorResponse() {

        this("Error response message!");

    }

}
