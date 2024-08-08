package com.mrfurkisan.core.expression.baseNodes;

import lombok.Getter;

public abstract class ConditionalNodeExpression extends NodeExpression {

    public @Getter final Boolean isEqual;
    public @Getter final Boolean isLike;

    public ConditionalNodeExpression(NodeType type) {

        super(type, true, false);
        
        switch (type) {

            case NodeType.EQUAL, NodeType.SMALLER_THAN_OR_EQUAL, NodeType.GREATER_THAN_OR_EQUAL:
                this.isEqual = true;
                this.isLike = false;
                break;
            case NodeType.LIKE:
                this.isLike = true;
                this.isEqual = false;
                break;
            default:
                this.isEqual = false;
                this.isLike = false;
                break;
        }

    }

}
