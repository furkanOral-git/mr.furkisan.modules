package com.mrfurkisan.core.expression.factories;

import com.mrfurkisan.core.expression.IExpressionBuilder;
import com.mrfurkisan.core.expression.base.ExpressionBuilder;
import com.mrfurkisan.core.models.IEntity;

public class ExpressionBuilderFactory implements IExpressionBuilderFactory {
   
    private static ExpressionBuilderFactory __instance;

    private ExpressionBuilderFactory() {
        super();
    }

    public static IExpressionBuilderFactory GetFactory() {
        
        if (__instance == null) {

            __instance = new ExpressionBuilderFactory();
        }
        return __instance;
    }

    @Override
    public <TEntity extends IEntity<?>> IExpressionBuilder<TEntity> fromEntity(Class<TEntity> type) {
        
        return new ExpressionBuilder<TEntity>();
    }
}
