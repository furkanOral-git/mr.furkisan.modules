package com.mrfurkisan.core.contracts;

import com.mrfurkisan.core.requests.DataResponse;

public class SuccessDataResponse<TData> extends DataResponse<TData> {

    public SuccessDataResponse(String message, TData data) {

        super(true, message, data);

    }

    public SuccessDataResponse(TData data) {
        this("Data response success message!", data);
    }

}
