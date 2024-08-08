package com.mrfurkisan.core.expression.baseNodes;




import com.mrfurkisan.core.expression.IExpression;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class NodeExpression implements IExpression {
    
    private final NodeType type;
    private final Boolean isConditional;
    private final Boolean isBinary;
}
