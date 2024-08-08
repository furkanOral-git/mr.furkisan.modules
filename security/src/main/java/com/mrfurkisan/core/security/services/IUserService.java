package com.mrfurkisan.core.security.services;

import com.mrfurkisan.core.vulnerabilities.IUserEntity;

public interface IUserService {
    public IUserEntity<Integer> getUserByEmail(String email);
}
