package com.mrfurkisan.core.expression.base;

import com.mrfurkisan.core.expression.*;
import com.mrfurkisan.core.models.IEntity;

public final class ExpressionBuilder<TEntity extends IEntity<?>>
        implements IExpressionBuilder<TEntity>, 
        IConditionalExpressionBuilder<TEntity>, IBinaryExpressionBuilder<TEntity> {

    public ExpressionBuilder() {
        super();
    }
    
    @Override
    public IConditionalExpressionBuilder<TEntity> where(IMethodCallExpressionBuilder<TEntity> builder) {
        
        return this;
    }

    @Override
    public IExpressionBuilder<TEntity> and() {
        
        return this;
    }

    @Override
    public IExpressionBuilder<TEntity> or() {
        return this;
    }

    @Override
    public IBinaryExpressionBuilder<TEntity> isEqualTo(IConstantExpressionBuilder builder) {
        
        return this;
    }

    @Override
    public IBinaryExpressionBuilder<TEntity> isGreaterThanOrEqual(IConstantExpressionBuilder builder) {
        return this;
    }

    @Override
    public IBinaryExpressionBuilder<TEntity> isSmallerThan(IConstantExpressionBuilder builder) {
        return this;
    }

    @Override
    public IBinaryExpressionBuilder<TEntity> isSmallerThanOrEqual(IConstantExpressionBuilder builder) {
        
        return this;
    }

    @Override
    public IBinaryExpressionBuilder<TEntity> isLike(IConstantExpressionBuilder builder) {
        
        return this;
    }

    @Override
    public IBinaryExpressionBuilder<TEntity> isGreaterThan(IConstantExpressionBuilder builder) {
        
        return this;
    }

    @Override
    public IExpression build() {
        return null;
    }

}
