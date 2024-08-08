package com.mrfurkisan.core.contracts;




import com.mrfurkisan.core.requests.Request;
import com.mrfurkisan.core.requests.RequestType;
import com.mrfurkisan.core.vulnerabilities.ISecurityTokenDto;

import lombok.Getter;

public abstract class SecureRequest<TData> extends Request<TData> {

    private @Getter final ISecurityTokenDto token;

    public SecureRequest(RequestType type, TData data, ISecurityTokenDto token) {
        super( type, true, data);
        this.token = token;
    }

    public SecureRequest(RequestType type, TData data, ISecurityTokenDto token) {
        this("unknown", type, data, token);
    }

    public SecureRequest(RequestType type, ISecurityTokenDto token) {
        this(type, null, token);
    }

}
