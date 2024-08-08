package com.mrfurkisan.core.models;

import java.util.List;

public abstract class AggregateRoot<TEntity extends IEntity<?>> implements IAggregateRoot<TEntity> {

    public final List<TEntity> __aggregate;

    public AggregateRoot(List<TEntity> aggregate) {
        
        super();
        this.__aggregate = aggregate;
    }
    
   
}
