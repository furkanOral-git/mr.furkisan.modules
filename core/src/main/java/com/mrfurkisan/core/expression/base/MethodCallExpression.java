package com.mrfurkisan.core.expression.base;



import com.mrfurkisan.core.expression.IExpression;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MethodCallExpression<T> implements IExpression {

    public final String name;
    public final Class<T> returnType;
    

}
