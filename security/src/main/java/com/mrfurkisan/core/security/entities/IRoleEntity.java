package com.mrfurkisan.core.security.entities;

import com.mrfurkisan.core.models.IEntity;
import com.mrfurkisan.core.security.enums.ActionPermissions;
import com.mrfurkisan.core.security.enums.DomainPermissions;
import com.mrfurkisan.core.security.enums.SecurityPermissions;

public interface IRoleEntity<TId> extends IEntity<TId> {
    
    public ActionPermissions getActionPermission();
    public SecurityPermissions getSecurityPermission();
    public DomainPermissions getDomainPermission();
}
