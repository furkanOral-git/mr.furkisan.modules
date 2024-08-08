package com.mrfurkisan.core.transactions.contexts;

import java.util.UUID;

import com.mrfurkisan.core.models.IEntity;
import com.mrfurkisan.core.repositories.IQueryableRepository;
import com.mrfurkisan.core.transactions.entities.*;
import com.mrfurkisan.core.transactions.operational.*;


import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


@Getter
public abstract class TransactionalContext<TEntity extends IEntity<?>>
        implements ITransactionalContext<TEntity> {

    private final UUID contextId;
    private final List<SavedTransaction<TEntity>> __savedTransactions;
    private final List<Transaction<TEntity>> __waitedTransactions;
    private final IQueryableRepository<TEntity> __repo;

    public TransactionalContext(IQueryableRepository<TEntity> repo) {

        super();
        this.contextId = UUID.randomUUID();
        this.__waitedTransactions = new ArrayList<Transaction<TEntity>>();
        this.__savedTransactions = new ArrayList<SavedTransaction<TEntity>>();
        this.__repo = repo;

    }

    @Override
    public void recoverTransaction(UUID transactionId) {
        
        for (int i = 0; i < __savedTransactions.size(); i++) {

            var savedTransaction = __savedTransactions.get(i);
            if (!savedTransaction.getId().equals(transactionId)) {
                continue;
            }
            if (savedTransaction.getType() == TransactionType.Insert) {

                this.__repo.delete(savedTransaction.getTransactionEntity());
            }
            if (savedTransaction.getType() == TransactionType.Remove) {

                this.__repo.addTo(savedTransaction.getTransactionEntity());
            }
            if (savedTransaction.getType() == TransactionType.Update) {
                
                var updateTransaction = (SavedUpdateTransaction<TEntity>) savedTransaction;
                this.__repo.update(updateTransaction.getPreviousEntity());
            }

            this.__savedTransactions.remove(i);
            break;
        }
        

    }

    @Override
    public void saveChanges() {

        for (Transaction<TEntity> tr : __waitedTransactions) {

            var type = tr.getType();
            switch (type) {
                case TransactionType.Insert:
                    this.saveInsert((InsertTransaction<TEntity>) tr);
                case TransactionType.Remove:
                    this.saveRemove((RemoveTransaction<TEntity>) tr);
                case TransactionType.Update:
                    this.saveUpdate((UpdateTransaction<TEntity>) tr);
                default:
                    break;
            }
        }
    }

    @Override
    public void saveInsert(InsertTransaction<TEntity> tr) {

        this.__repo.addTo(tr.getTransactionEntity());
        var saved = new SavedInsertTransaction<TEntity>(tr);
        this.__savedTransactions.add(saved);
        this.__waitedTransactions.remove(tr);

    }

    @Override
    public void saveRemove(RemoveTransaction<TEntity> tr) {

        this.__repo.delete(tr.getTransactionEntity());
        var saved = new SavedRemoveTransaction<TEntity>(tr);
        this.__waitedTransactions.remove(tr);
        this.__savedTransactions.add(saved);
    }

    @Override
    public void saveUpdate(UpdateTransaction<TEntity> tr) {

        this.__repo.update(tr.getTransactionEntity());
        var saved = new SavedUpdateTransaction<TEntity>(tr);
        this.__waitedTransactions.remove(tr);
        this.__savedTransactions.add(saved);
    }

    @Override
    public void createInsertTransaction(TEntity entity) {

        var tr = new InsertTransaction<TEntity>(entity);
        this.__waitedTransactions.add(tr);
    }

    @Override
    public void createRemoveTransaction(TEntity entity) {

        var tr = new RemoveTransaction<TEntity>(entity);
        this.__waitedTransactions.add(tr);
    }

    @Override
    public void createUpdateTransaction(TEntity newEntity, TEntity prevEntity) {

        var tr = new UpdateTransaction<TEntity>(newEntity, prevEntity);
        this.__waitedTransactions.add(tr);
    }

    @Override
    public void undo(Transaction<TEntity> tr) {

        this.__waitedTransactions.remove(tr);
    }

    @Override
    public void undoAll() {

        this.__waitedTransactions.clear();
    }

}
