package com.mrfurkisan.core.expression.binaries;

import com.mrfurkisan.core.expression.baseNodes.BinaryNodeExpression;
import com.mrfurkisan.core.expression.baseNodes.NodeType;

public class AndBinaryNodeExpression extends BinaryNodeExpression {

    public AndBinaryNodeExpression() {
        super(NodeType.AND);
    }

}
