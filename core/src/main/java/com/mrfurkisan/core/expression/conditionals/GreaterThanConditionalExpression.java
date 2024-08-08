package com.mrfurkisan.core.expression.conditionals;

import com.mrfurkisan.core.expression.base.ConditionalExpression;
import com.mrfurkisan.core.expression.base.ConstantExpression;
import com.mrfurkisan.core.expression.base.MethodCallExpression;

public class GreaterThanConditionalExpression extends ConditionalExpression<GreaterThanNodeExpression> {

    public GreaterThanConditionalExpression(MethodCallExpression<?> left, ConstantExpression<?> right) {
        super(left, new GreaterThanNodeExpression(), right);
    }

}
