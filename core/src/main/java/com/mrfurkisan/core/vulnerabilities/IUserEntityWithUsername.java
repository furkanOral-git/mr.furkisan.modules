package com.mrfurkisan.core.vulnerabilities;


public interface IUserEntityWithUsername<TId> extends IUserEntity<TId> {

    public String getUsername();
    
}
