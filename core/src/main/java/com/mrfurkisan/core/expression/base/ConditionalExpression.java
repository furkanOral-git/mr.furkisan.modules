package com.mrfurkisan.core.expression.base;



import com.mrfurkisan.core.expression.IExpression;
import com.mrfurkisan.core.expression.baseNodes.ConditionalNodeExpression;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class ConditionalExpression<TNode extends ConditionalNodeExpression> implements IExpression {

    public final MethodCallExpression<?> left;
    public final TNode node;
    public final ConstantExpression<?> right;

}
