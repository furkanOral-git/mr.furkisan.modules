package com.mrfurkisan.core.contracts;

import com.mrfurkisan.core.requests.DataResponse;

public class ErrorDataResponse<TData> extends DataResponse<TData> {


    public ErrorDataResponse(String message) {

        super(false, message, null);
        
    }
    public ErrorDataResponse(Exception ex) {

        this(ex.getMessage());
        
    }

    public ErrorDataResponse() {

        this("Data response error message!");
    }
}
