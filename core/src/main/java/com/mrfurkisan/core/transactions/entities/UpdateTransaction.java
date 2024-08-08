package com.mrfurkisan.core.transactions.entities;


import lombok.Getter;

import java.util.UUID;

import com.mrfurkisan.core.models.IEntity;

@Getter
public class UpdateTransaction<TEntity extends IEntity<?>> extends Transaction<TEntity> {

    private TEntity previousEntity;

    public UpdateTransaction(TEntity newVal, TEntity prevVal) {

        super(TransactionType.Update, newVal, UUID.randomUUID());
        this.previousEntity = prevVal;
    }

    @Override
    public void setTransactionEntity(TEntity transactionEntity) {
        
        this.previousEntity = this.getTransactionEntity();
        super.setTransactionEntity(transactionEntity);
    }
    

}
