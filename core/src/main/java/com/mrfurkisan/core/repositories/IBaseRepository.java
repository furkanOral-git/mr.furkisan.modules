package com.mrfurkisan.core.repositories;


import java.util.List;

import com.mrfurkisan.core.models.IEntity;

public interface IBaseRepository<TEntity extends IEntity<?>> {

    public void addTo(TEntity entity);

    public void delete(TEntity entity);

    public void update(TEntity entity);

    public List<TEntity> getAll();

    public TEntity getById();
}
