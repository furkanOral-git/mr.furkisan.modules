package com.mrfurkisan.core.expression;

import com.mrfurkisan.core.expression.base.ExpressionBuilder;
import com.mrfurkisan.core.models.IEntity;

public sealed interface IBinaryExpressionBuilder<TEntity extends IEntity<?>> permits ExpressionBuilder{

    public IExpressionBuilder<TEntity> and();

    public IExpressionBuilder<TEntity> or();

    public IExpression build();

}
