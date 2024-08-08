package com.mrfurkisan.core.expression.base;


import com.mrfurkisan.core.expression.IExpression;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class ConstantExpression<T> implements IExpression {
    
    public final T value;
}
