package com.mrfurkisan.core.security.services;

import com.mrfurkisan.core.application.IApplicationService;
import com.mrfurkisan.core.contracts.*;
import com.mrfurkisan.core.contracts.forms.*;
import com.mrfurkisan.core.requests.DataResponse;
import com.mrfurkisan.core.requests.Response;
import com.mrfurkisan.core.vulnerabilities.ISecurityTokenDto;

public interface ISecurityService extends IApplicationService {

    public Response changeUserName(SecurePutRequest<String> req);

    public Response changePassword(SecurePutRequest<String> req);

    public Response changeEmail(SecurePutRequest<String> req);

    public Response changePhone(SecurePutRequest<String> req);

    public Response authorize(SecureRequest<?> req);

    public DataResponse<ISecurityTokenDto> login(SecureGetRequest<LoginForm> req);

    public Response register(SecurePostRequest<RegisterForm> req);

    public Response logout(SecureDeleteRequest<?> req);
}
