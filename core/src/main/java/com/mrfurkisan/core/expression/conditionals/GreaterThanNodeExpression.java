package com.mrfurkisan.core.expression.conditionals;

import com.mrfurkisan.core.expression.baseNodes.ConditionalNodeExpression;
import com.mrfurkisan.core.expression.baseNodes.NodeType;

public class GreaterThanNodeExpression extends ConditionalNodeExpression {

    public GreaterThanNodeExpression() {
        this(NodeType.GREATER_THAN);
    }

    protected GreaterThanNodeExpression(NodeType type) {
        super(type);
    }
}
