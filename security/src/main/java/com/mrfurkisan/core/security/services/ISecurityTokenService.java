package com.mrfurkisan.core.security.services;

import com.mrfurkisan.core.requests.Response;
import com.mrfurkisan.core.vulnerabilities.ISecurityTokenDto;

public interface ISecurityTokenService {

    public Response isValid(ISecurityTokenDto token);
}
