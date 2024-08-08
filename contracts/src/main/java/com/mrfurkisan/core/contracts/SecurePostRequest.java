package com.mrfurkisan.core.contracts;

import com.mrfurkisan.core.requests.RequestType;
import com.mrfurkisan.core.vulnerabilities.ISecurityTokenDto;

public class SecurePostRequest<TData> extends SecureRequest<TData> {

    public SecurePostRequest(String audit, TData data, ISecurityTokenDto token) {
        super(audit, RequestType.POST, data, token);

    }

    public SecurePostRequest(TData data, ISecurityTokenDto token) {
        super(RequestType.POST, data, token);
    }

}
