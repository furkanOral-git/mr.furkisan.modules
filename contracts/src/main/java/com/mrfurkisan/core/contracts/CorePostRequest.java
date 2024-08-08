package com.mrfurkisan.core.contracts;

import com.mrfurkisan.core.requests.Request;
import com.mrfurkisan.core.requests.RequestType;

public class CorePostRequest<TData> extends Request<TData> {

    public CorePostRequest(String audit, boolean hasToken, TData data) {
        super(audit, RequestType.POST, hasToken, data);

    }

    public CorePostRequest(boolean hasToken, TData data) {
        super(RequestType.POST, hasToken, data);
    }

    public CorePostRequest(TData data) {

        super(RequestType.POST, data);
    }

}
