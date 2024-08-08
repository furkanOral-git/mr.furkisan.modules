package com.mrfurkisan.core.security.services;

import com.mrfurkisan.core.security.entities.IRoleEntity;

public interface IRoleService {

    public IRoleEntity<Integer> getRoleById(Integer id);
}
