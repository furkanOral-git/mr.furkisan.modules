package com.mrfurkisan.core.vulnerabilities;


public interface IUserEntityWithPhone<TId> extends IUserEntity<TId> {
    
    public String getPhoneNumber();
    
}
