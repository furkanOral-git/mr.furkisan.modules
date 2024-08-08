package com.mrfurkisan.core.contracts;

import com.mrfurkisan.core.requests.RequestType;
import com.mrfurkisan.core.vulnerabilities.ISecurityTokenDto;

public class SecurePutRequest<TData> extends SecureRequest<TData> {

    public SecurePutRequest(String audit, TData data, ISecurityTokenDto token) {
        super(audit, RequestType.PUT, data, token);

    }

    public SecurePutRequest(TData data, ISecurityTokenDto token) {
        super(RequestType.PUT, data, token);
    }

}
