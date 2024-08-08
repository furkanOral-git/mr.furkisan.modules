package com.mrfurkisan.core.transactions.entities;

import java.util.UUID;

import com.mrfurkisan.core.models.IEntity;


public class InsertTransaction<TEntity extends IEntity<?>> extends Transaction<TEntity> {

    public InsertTransaction(TEntity transactionEntity) {
        super(TransactionType.Insert, transactionEntity, UUID.randomUUID());

    }

}
