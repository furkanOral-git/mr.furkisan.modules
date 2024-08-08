package com.mrfurkisan.core.security.repositories;

import com.mrfurkisan.core.repositories.IQueryableRepository;
import com.mrfurkisan.core.vulnerabilities.IUserEntityWithUsername;

public interface IUserWithUsernameRepository extends IQueryableRepository<IUserEntityWithUsername<?>> {

}
