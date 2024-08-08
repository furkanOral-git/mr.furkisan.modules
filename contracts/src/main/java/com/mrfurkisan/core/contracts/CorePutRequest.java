package com.mrfurkisan.core.contracts;

import com.mrfurkisan.core.requests.Request;
import com.mrfurkisan.core.requests.RequestType;

public class CorePutRequest<TData> extends Request<TData> {

    public CorePutRequest(String audit, boolean hasToken, TData data) {
        super(audit, RequestType.PUT, hasToken, data);

    }

    public CorePutRequest(boolean hasToken, TData data) {
        super(RequestType.PUT, hasToken, data);
    }

    public CorePutRequest(TData data) {
        super(RequestType.PUT, data);
    }
    
}
