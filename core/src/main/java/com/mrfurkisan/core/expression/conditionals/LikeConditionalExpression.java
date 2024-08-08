package com.mrfurkisan.core.expression.conditionals;

import com.mrfurkisan.core.expression.base.ConditionalExpression;
import com.mrfurkisan.core.expression.base.ConstantExpression;
import com.mrfurkisan.core.expression.base.MethodCallExpression;

public class LikeConditionalExpression extends ConditionalExpression<LikeConditionalNodeExpression> {

    public LikeConditionalExpression(MethodCallExpression<?> left,
            ConstantExpression<String> right) {
        super(left, new LikeConditionalNodeExpression(), right);
                
    }

}
