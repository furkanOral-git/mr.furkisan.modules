package com.mrfurkisan.core.expression.factories;

import com.mrfurkisan.core.expression.IExpressionBuilder;
import com.mrfurkisan.core.models.IEntity;

public interface IExpressionBuilderFactory {

    public <TEntity extends IEntity<?>> IExpressionBuilder<TEntity> fromEntity(Class<TEntity> type);

}
