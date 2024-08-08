package com.mrfurkisan.core.contracts;

import com.mrfurkisan.core.requests.Request;
import com.mrfurkisan.core.requests.RequestType;

public class CoreGetRequest<TData> extends Request<TData> {

    public CoreGetRequest(String audit, boolean hasToken, TData data) {
        super(audit, RequestType.GET, hasToken, data);

    }

    public CoreGetRequest(boolean hasToken, TData data) {
        super(RequestType.GET, hasToken, data);
    }

    public CoreGetRequest(TData data) {
        super(RequestType.GET, data);
    }

    public CoreGetRequest() {

        super(RequestType.GET);
    }
}
