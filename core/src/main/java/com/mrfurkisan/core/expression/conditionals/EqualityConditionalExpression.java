package com.mrfurkisan.core.expression.conditionals;

import com.mrfurkisan.core.expression.base.ConditionalExpression;
import com.mrfurkisan.core.expression.base.ConstantExpression;
import com.mrfurkisan.core.expression.base.MethodCallExpression;

public class EqualityConditionalExpression extends ConditionalExpression<EqualityNodeExpression> {

    public EqualityConditionalExpression(MethodCallExpression<?> left, ConstantExpression<?> right) {
        super(left, new EqualityNodeExpression(), right);
    }

}
