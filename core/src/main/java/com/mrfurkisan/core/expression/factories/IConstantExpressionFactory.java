package com.mrfurkisan.core.expression.factories;


import java.sql.Time;

import com.mrfurkisan.core.expression.constants.BooleanConstantExpression;
import com.mrfurkisan.core.expression.constants.CharacterConstantExpression;
import com.mrfurkisan.core.expression.constants.DateTimeConstantExpression;
import com.mrfurkisan.core.expression.constants.StringConstantExpression;
import com.mrfurkisan.core.expression.constants.numbers.ByteConstantExpression;
import com.mrfurkisan.core.expression.constants.numbers.DoubleConstantExpression;
import com.mrfurkisan.core.expression.constants.numbers.FloatConstantExpression;
import com.mrfurkisan.core.expression.constants.numbers.IntegerConstantExpression;



public interface IConstantExpressionFactory {
    
    public IntegerConstantExpression Integer(Integer value);

    public DoubleConstantExpression Double(Double value);

    public ByteConstantExpression Byte(Byte value);

    public BooleanConstantExpression Boolean(Boolean value);

    public FloatConstantExpression Float(Float value);

    public StringConstantExpression String(String value);

    public CharacterConstantExpression Char(Character value);

    public DateTimeConstantExpression DateTime(Time value);
}
