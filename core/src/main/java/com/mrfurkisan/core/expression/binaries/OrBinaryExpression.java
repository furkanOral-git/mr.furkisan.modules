package com.mrfurkisan.core.expression.binaries;

import com.mrfurkisan.core.expression.base.BinaryExpression;
import com.mrfurkisan.core.expression.base.ConditionalExpression;

public class OrBinaryExpression extends BinaryExpression<OrBinaryNodeExpression> {

    public OrBinaryExpression(ConditionalExpression<?> left, ConditionalExpression<?> right) {
        super(left, new OrBinaryNodeExpression(), right);
    }

}
