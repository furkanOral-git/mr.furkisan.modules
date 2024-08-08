package com.mrfurkisan.core.security.dtos;

import com.mrfurkisan.core.vulnerabilities.ISecurityTokenDto;
import com.mrfurkisan.core.vulnerabilities.ISecurityTokenEntity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class SecurityTokenDto implements ISecurityTokenDto {

    private final String id;
    private final String audit;

    @Override
    public boolean isMatch(ISecurityTokenDto token) {

        return this.equals(token);
    }

    @Override
    public boolean isMatch(ISecurityTokenEntity entity) {

        return this.id == entity.getId() && this.audit == entity.getAudit();
    }

}
