package com.mrfurkisan.core.expression;

import com.mrfurkisan.core.expression.base.ExpressionBuilder;
import com.mrfurkisan.core.models.IEntity;

public sealed interface IConditionalExpressionBuilder<TEntity extends IEntity<?>> permits ExpressionBuilder {

        public IBinaryExpressionBuilder<TEntity> isEqualTo(IConstantExpressionBuilder builder);

        public IBinaryExpressionBuilder<TEntity> isGreaterThan(IConstantExpressionBuilder builder);

        public IBinaryExpressionBuilder<TEntity> isGreaterThanOrEqual(IConstantExpressionBuilder builder);

        public IBinaryExpressionBuilder<TEntity> isSmallerThan(IConstantExpressionBuilder builder);

        public IBinaryExpressionBuilder<TEntity> isSmallerThanOrEqual(IConstantExpressionBuilder builder);

        public IBinaryExpressionBuilder<TEntity> isLike(IConstantExpressionBuilder builder);

}
