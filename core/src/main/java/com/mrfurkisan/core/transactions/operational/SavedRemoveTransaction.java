package com.mrfurkisan.core.transactions.operational;

import com.mrfurkisan.core.models.IEntity;
import com.mrfurkisan.core.transactions.entities.RemoveTransaction;

public class SavedRemoveTransaction<TEntity extends IEntity<?>> extends SavedTransaction<TEntity> {

    public SavedRemoveTransaction(RemoveTransaction<TEntity> transaction) {
        super(transaction.getType(), transaction.getTransactionEntity(), transaction.getId());
        
    }

}
