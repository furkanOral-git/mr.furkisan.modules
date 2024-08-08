package com.mrfurkisan.core.models;

public interface IEntityRoot<TRoot extends IAggregateRoot<?>, TId> extends IEntity<TId> {
    public TRoot createAggregateRoot();
}
