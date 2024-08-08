package com.mrfurkisan.core.expression.conditionals;

import com.mrfurkisan.core.expression.baseNodes.ConditionalNodeExpression;
import com.mrfurkisan.core.expression.baseNodes.NodeType;

public class EqualityNodeExpression extends ConditionalNodeExpression {

    public EqualityNodeExpression() {
        super(NodeType.EQUAL);
    }

}
