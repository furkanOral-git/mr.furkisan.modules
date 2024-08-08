package com.mrfurkisan.core.expression;

import com.mrfurkisan.core.expression.base.ExpressionBuilder;
import com.mrfurkisan.core.models.IEntity;

public sealed interface IExpressionBuilder<TEntity extends IEntity<?>> permits ExpressionBuilder {

    public  IConditionalExpressionBuilder<TEntity> where(IMethodCallExpressionBuilder<TEntity> builder);

}
