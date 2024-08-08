package com.mrfurkisan.core.transactions.contexts;

import java.util.UUID;

import com.mrfurkisan.core.models.IEntity;
import com.mrfurkisan.core.transactions.entities.InsertTransaction;
import com.mrfurkisan.core.transactions.entities.RemoveTransaction;
import com.mrfurkisan.core.transactions.entities.Transaction;
import com.mrfurkisan.core.transactions.entities.UpdateTransaction;



public interface ITransactionalContext<TEntity extends IEntity<?>> {

    public void undoAll();

    public void undo(Transaction<TEntity> tr);

    public void recoverTransaction(UUID transationId);

    public void saveChanges();

    public void saveInsert(InsertTransaction<TEntity> tr);

    public void saveUpdate(UpdateTransaction<TEntity> tr);

    public void saveRemove(RemoveTransaction<TEntity> tr);

    public void createInsertTransaction(TEntity entity);

    public void createRemoveTransaction(TEntity entity);

    public void createUpdateTransaction(TEntity newEntity, TEntity prevEntity);
}
