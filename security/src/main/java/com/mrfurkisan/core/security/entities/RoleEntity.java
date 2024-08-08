package com.mrfurkisan.core.security.entities;

import com.mrfurkisan.core.security.enums.ActionPermissions;
import com.mrfurkisan.core.security.enums.DomainPermissions;
import com.mrfurkisan.core.security.enums.SecurityPermissions;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class RoleEntity implements IRoleEntity<Integer> {

    private final Integer id;
    private final ActionPermissions actionPermission;
    private final SecurityPermissions securityPermission;
    private final DomainPermissions domainPermission;

}
