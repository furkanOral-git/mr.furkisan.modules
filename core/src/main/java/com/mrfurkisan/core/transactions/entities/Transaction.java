package com.mrfurkisan.core.transactions.entities;



import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

import com.mrfurkisan.core.models.IEntity;

@Getter
public abstract class Transaction<TEntity extends IEntity<?>> {

    private final TransactionType type;
    private @Setter TEntity transactionEntity;
    private @Setter TransactionStatus currentStatus;
    private final UUID id;

    public Transaction(TransactionType type, TEntity transactionEntity, UUID id) {

        super();
        this.type = type;
        this.transactionEntity = transactionEntity;
        this.id = id;
        this.currentStatus = TransactionStatus.Initial;

    }

    

}
