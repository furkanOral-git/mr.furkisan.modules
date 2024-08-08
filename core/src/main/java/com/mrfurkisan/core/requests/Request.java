package com.mrfurkisan.core.requests;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public abstract class Request<TData> {

    
    private final RequestType type;
    private final boolean hasToken;
    private final TData data;

    public Request(RequestType type, boolean hasToken, TData data) {
        this(type, hasToken, data);
    }

    public Request(RequestType type, TData data) {
        this(type, false, data);
    }

    public Request(RequestType type) {
        this(type, null);
    }

}
