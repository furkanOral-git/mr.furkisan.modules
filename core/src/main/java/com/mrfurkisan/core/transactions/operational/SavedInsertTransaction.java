package com.mrfurkisan.core.transactions.operational;

import com.mrfurkisan.core.models.IEntity;
import com.mrfurkisan.core.transactions.entities.InsertTransaction;

public class SavedInsertTransaction<TEntity extends IEntity<?>> extends SavedTransaction<TEntity> {

    public SavedInsertTransaction(InsertTransaction<TEntity> transaction) {
        super(transaction.getType(), transaction.getTransactionEntity(), transaction.getId());
        
    }

}
