package com.mrfurkisan.core.functional;

import com.mrfurkisan.core.expression.IExpressionBuilder;

@FunctionalInterface
public interface IQueryableBaseFunc<TParameter extends IExpressionBuilder<?>, TResponse> {
    public TResponse exec(TParameter query);
}
