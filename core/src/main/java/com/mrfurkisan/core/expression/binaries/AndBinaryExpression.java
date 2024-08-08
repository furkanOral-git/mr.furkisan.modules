package com.mrfurkisan.core.expression.binaries;

import com.mrfurkisan.core.expression.base.BinaryExpression;
import com.mrfurkisan.core.expression.base.ConditionalExpression;

public class AndBinaryExpression extends BinaryExpression<AndBinaryNodeExpression> {

    public AndBinaryExpression(ConditionalExpression<?> left,
            ConditionalExpression<?> right) {
        super(left, new AndBinaryNodeExpression(), right);
        
    }

}
