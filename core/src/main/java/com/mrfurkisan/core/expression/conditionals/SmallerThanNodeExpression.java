package com.mrfurkisan.core.expression.conditionals;

import com.mrfurkisan.core.expression.baseNodes.ConditionalNodeExpression;
import com.mrfurkisan.core.expression.baseNodes.NodeType;

public class SmallerThanNodeExpression extends ConditionalNodeExpression {

    public SmallerThanNodeExpression() {
        this(NodeType.SMALLER_THAN);
    }

    protected SmallerThanNodeExpression(NodeType type) {
        super(type);
    }
}
