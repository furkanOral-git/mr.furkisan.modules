package com.mrfurkisan.core.expression.factories;

import com.mrfurkisan.core.expression.base.MethodCallExpression;
import com.mrfurkisan.core.models.IEntity;

public interface IMethodCallExpressionFactory {

    public <T, TEntity extends IEntity<?>> MethodCallExpression<?> call(String name, Class<T> returnType);
}
