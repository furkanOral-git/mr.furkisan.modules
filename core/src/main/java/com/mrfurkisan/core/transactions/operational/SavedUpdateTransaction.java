package com.mrfurkisan.core.transactions.operational;


import com.mrfurkisan.core.models.IEntity;
import com.mrfurkisan.core.transactions.entities.UpdateTransaction;

import lombok.Getter;

public class SavedUpdateTransaction<TEntity extends IEntity<?>> extends SavedTransaction<TEntity> {

    private @Getter final TEntity previousEntity;

    public SavedUpdateTransaction(UpdateTransaction<TEntity> transaction) {
        
        super(transaction.getType(), transaction.getTransactionEntity(), transaction.getId());
        this.previousEntity = transaction.getPreviousEntity();

    }

}
