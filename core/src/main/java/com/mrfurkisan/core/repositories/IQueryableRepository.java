package com.mrfurkisan.core.repositories;

import java.util.List;

import com.mrfurkisan.core.expression.IExpressionBuilder;
import com.mrfurkisan.core.functional.IQueryableFunc;
import com.mrfurkisan.core.models.IEntity;



public interface IQueryableRepository<TEntity extends IEntity<?>>
        extends IBaseRepository<TEntity> {

    public IExpressionBuilder<TEntity> getExpressionBuilder();

    public TEntity getBy(IQueryableFunc<TEntity> func);

    public List<TEntity> getAllBy(IQueryableFunc<TEntity> func);

    public int updateBy(IQueryableFunc<TEntity> predicate, TEntity newEntity);

    public int deleteBy(IQueryableFunc<TEntity> predicate);
}
