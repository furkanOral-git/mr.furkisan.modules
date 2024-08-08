package com.mrfurkisan.core.expression;

import com.mrfurkisan.core.expression.base.ConstantExpression;
import com.mrfurkisan.core.expression.factories.IConstantExpressionFactory;
import com.mrfurkisan.core.functional.IFunc;

public interface IConstantExpressionBuilder extends IFunc<IConstantExpressionFactory, ConstantExpression<?>>  {
    
}
