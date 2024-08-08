package com.mrfurkisan.core.functional;

import com.mrfurkisan.core.expression.IExpression;
import com.mrfurkisan.core.expression.IExpressionBuilder;
import com.mrfurkisan.core.models.IEntity;

public interface IQueryableFunc<TEntity extends IEntity<?>> extends IQueryableBaseFunc<IExpressionBuilder<TEntity>, IExpression> {
    
}
