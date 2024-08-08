package com.mrfurkisan.core.transactions.operational;

import java.util.UUID;

import com.mrfurkisan.core.models.IEntity;
import com.mrfurkisan.core.transactions.entities.Transaction;
import com.mrfurkisan.core.transactions.entities.TransactionStatus;
import com.mrfurkisan.core.transactions.entities.TransactionType;



public abstract class SavedTransaction<TEntity extends IEntity<?>> extends Transaction<TEntity> {

    public SavedTransaction(TransactionType type, TEntity transactionEntity, UUID id) {
        super(type, transactionEntity, id);
        this.setCurrentStatus(TransactionStatus.Saved);
    }

}
