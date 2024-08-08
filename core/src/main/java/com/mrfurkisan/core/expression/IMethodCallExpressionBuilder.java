package com.mrfurkisan.core.expression;

import com.mrfurkisan.core.expression.base.MethodCallExpression;
import com.mrfurkisan.core.expression.factories.IMethodCallExpressionFactory;
import com.mrfurkisan.core.functional.IFunc;
import com.mrfurkisan.core.models.IEntity;

@FunctionalInterface
public interface IMethodCallExpressionBuilder<TEntity extends IEntity<?>>
                extends IFunc<IMethodCallExpressionFactory, MethodCallExpression<?>> {

}
