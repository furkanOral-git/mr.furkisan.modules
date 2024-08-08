package com.mrfurkisan.core.transactions.entities;

import java.util.UUID;

import com.mrfurkisan.core.models.IEntity;


public class RemoveTransaction<TEntity extends IEntity<?>> extends Transaction<TEntity> {

    public RemoveTransaction(TEntity transactionEntity) {
        super(TransactionType.Remove, transactionEntity, UUID.randomUUID());

    }

}
