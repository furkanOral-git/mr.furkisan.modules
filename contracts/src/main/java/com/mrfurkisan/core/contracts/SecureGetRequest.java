package com.mrfurkisan.core.contracts;

import com.mrfurkisan.core.requests.RequestType;
import com.mrfurkisan.core.vulnerabilities.ISecurityTokenDto;

public class SecureGetRequest<TData> extends SecureRequest<TData> {

    public SecureGetRequest(String audit, TData data, ISecurityTokenDto token) {
        super(audit, RequestType.GET, data, token);

    }

    public SecureGetRequest(TData data, ISecurityTokenDto token) {
        super(RequestType.GET, data, token);
    }

    public SecureGetRequest(ISecurityTokenDto token) {
        super(RequestType.GET, token);
    }

}
