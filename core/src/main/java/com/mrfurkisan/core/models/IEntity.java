package com.mrfurkisan.core.models;


public interface IEntity<TId> extends IBaseEntity {

    public TId getId();

}
