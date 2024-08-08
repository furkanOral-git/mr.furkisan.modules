package com.mrfurkisan.core.vulnerabilities;


public interface IUserEntityWithBoth<TId> extends IUserEntity<TId> {

    public String getPhoneNumber();
    
    public String getUsername();
    
}
