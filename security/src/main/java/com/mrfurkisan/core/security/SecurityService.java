package com.mrfurkisan.core.security;

import com.mrfurkisan.core.contracts.*;
import com.mrfurkisan.core.contracts.forms.*;
import com.mrfurkisan.core.requests.DataResponse;
import com.mrfurkisan.core.requests.RequestType;
import com.mrfurkisan.core.requests.Response;
import com.mrfurkisan.core.security.services.*;
import com.mrfurkisan.core.vulnerabilities.ISecurityTokenDto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SecurityService implements ISecurityService {

    private final IUserService userService;
    private final ISecurityTokenService securityTokenService;
    private final IRoleService roleService;

    @Override
    public Response changeUserName(SecurePutRequest<String> req) {
        return null;

    }

    @Override
    public Response changePassword(SecurePutRequest<String> req) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'changePassword'");
    }

    @Override
    public Response changeEmail(SecurePutRequest<String> req) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'changeEmail'");
    }

    @Override
    public Response changePhone(SecurePutRequest<String> req) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'changePhone'");
    }

    @Override
    public DataResponse<ISecurityTokenDto> login(SecureGetRequest<LoginForm> req) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'login'");
    }

    @Override
    public Response register(SecurePostRequest<RegisterForm> req) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'register'");
    }

    @Override
    public Response logout(SecureDeleteRequest<?> req) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'logout'");
    }

    @Override
    public Response authorize(SecureRequest<?> req) {

        var token = req.getToken();
        var isAuthenticated = securityTokenService.isValid(token);
        if (!isAuthenticated.isSuccess()) {

            return isAuthenticated;
        }

        var user = userService.getUserByEmail(token.getAudit());
        var role = roleService.getRoleById(user.getRoleId());
        var controllerClass = this.catchCallingControllerClass();

        var authority = controllerClass.getAnnotation(Authority.class);

        // action permission validation yapılacak
        
        var hasPermissionForAccess = authority.security().level() >= role.getSecurityPermission().level();
        if (!hasPermissionForAccess) {
            return new ErrorResponse("Not Authorized!");
        }
        var hasPermissionForDomain = false;

        for (int i = 0; i < authority.domains().length; i++) {

            if (role.getDomainPermission().equals(authority.domains()[i])) {
                hasPermissionForDomain = true;
                break;
            }
        }
        if (!hasPermissionForDomain) {
            return new ErrorResponse("Not Authorized");
        }

        return new SuccessResponse();
    }

}
