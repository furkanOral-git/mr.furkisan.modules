package com.mrfurkisan.core.expression.base;

import com.mrfurkisan.core.expression.IExpression;
import com.mrfurkisan.core.expression.baseNodes.BinaryNodeExpression;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class BinaryExpression<TNode extends BinaryNodeExpression> implements IExpression {

    public final ConditionalExpression<?> left;
    public final TNode node;
    public final ConditionalExpression<?> right;
}
