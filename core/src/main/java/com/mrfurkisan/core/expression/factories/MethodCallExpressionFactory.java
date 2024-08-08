package com.mrfurkisan.core.expression.factories;

import com.mrfurkisan.core.expression.base.MethodCallExpression;
import com.mrfurkisan.core.models.IEntity;

public class MethodCallExpressionFactory implements IMethodCallExpressionFactory {

    private static MethodCallExpressionFactory __instance;

    private MethodCallExpressionFactory() {
        super();
    }

    public static IMethodCallExpressionFactory GetFactory() {

        if (__instance == null) {

            __instance = new MethodCallExpressionFactory();
        }
        return __instance;
    }

    @Override
    public <T, TEntity extends IEntity<?>> MethodCallExpression<?> call(String name, Class<T> returnType) {
        return new MethodCallExpression<T>(name, returnType);
    }

}
