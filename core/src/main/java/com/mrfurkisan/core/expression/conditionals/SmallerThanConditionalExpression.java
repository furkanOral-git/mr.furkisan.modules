package com.mrfurkisan.core.expression.conditionals;

import com.mrfurkisan.core.expression.base.ConditionalExpression;
import com.mrfurkisan.core.expression.base.ConstantExpression;
import com.mrfurkisan.core.expression.base.MethodCallExpression;

public class SmallerThanConditionalExpression extends ConditionalExpression<SmallerThanNodeExpression> {

    public SmallerThanConditionalExpression(MethodCallExpression<?> left,
            ConstantExpression<?> right) {
        super(left, new SmallerThanNodeExpression(), right);
    }

}
