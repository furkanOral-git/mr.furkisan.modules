package com.mrfurkisan.core.contracts;

import com.mrfurkisan.core.requests.Request;
import com.mrfurkisan.core.requests.RequestType;

public class CoreDeleteRequest<TData> extends Request<TData> {

    public CoreDeleteRequest(String audit, boolean hasToken, TData data) {
        super(audit, RequestType.DELETE, hasToken, data);

    }

    public CoreDeleteRequest(boolean hasToken, TData data) {
        super(RequestType.DELETE, hasToken, data);
    }

    public CoreDeleteRequest(TData data) {

        super(RequestType.DELETE, data);
    }

}
