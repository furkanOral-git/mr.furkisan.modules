package com.mrfurkisan.core.vulnerabilities;

import com.mrfurkisan.core.models.IEntity;

public interface IUserEntity<TId> extends IEntity<TId> {
    
    public Integer getRoleId();

    public String getEmail();

    public String getPassword();

    public String getSalt();

    public String getNameAndSurname();
}
