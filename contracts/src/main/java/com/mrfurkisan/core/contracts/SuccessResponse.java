package com.mrfurkisan.core.contracts;

import com.mrfurkisan.core.requests.Response;

public class SuccessResponse extends Response {

    public SuccessResponse(String message) {
        super(true, message);
       
    }
    public SuccessResponse() {
        this("Success response message!");
    }

}
