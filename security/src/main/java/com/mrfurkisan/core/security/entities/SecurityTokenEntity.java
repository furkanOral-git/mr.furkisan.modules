package com.mrfurkisan.core.security.entities;

import com.mrfurkisan.core.security.dtos.SecurityTokenDto;
import com.mrfurkisan.core.vulnerabilities.ISecurityTokenDto;
import com.mrfurkisan.core.vulnerabilities.ISecurityTokenEntity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class SecurityTokenEntity implements ISecurityTokenEntity {

    private final String id;
    private final String audit;
    private final String deviceId;
    private final Integer roleId;

    @Override
    public ISecurityTokenDto mapToDto() {

        return new SecurityTokenDto(this.id, this.audit);
    }

}
