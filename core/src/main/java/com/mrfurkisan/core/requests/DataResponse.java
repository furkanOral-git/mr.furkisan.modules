package com.mrfurkisan.core.requests;

import lombok.Getter;

public abstract class DataResponse<TData> extends Response {

    private @Getter final TData data;
    private @Getter final boolean isDataNull;

    public DataResponse(boolean isSuccess, String message, TData data) {
        super(isSuccess, message);
        this.data = data;
        this.isDataNull = (data.equals(null)) ? true : false;
    }

}
