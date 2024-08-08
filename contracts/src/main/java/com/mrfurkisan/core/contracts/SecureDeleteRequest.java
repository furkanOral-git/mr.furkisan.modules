package com.mrfurkisan.core.contracts;

import com.mrfurkisan.core.requests.RequestType;
import com.mrfurkisan.core.vulnerabilities.ISecurityTokenDto;

public class SecureDeleteRequest<TData> extends SecureRequest<TData> {

    public SecureDeleteRequest(String audit, TData data, ISecurityTokenDto token) {
        super(audit, RequestType.DELETE, data, token);

    }

    public SecureDeleteRequest(TData data, ISecurityTokenDto token) {
        super(RequestType.DELETE, data, token);
    }

}
