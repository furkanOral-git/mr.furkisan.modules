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

public class ConstantExpressionFactory implements IConstantExpressionFactory {

    private static ConstantExpressionFactory __instance;

    private ConstantExpressionFactory() {
        super();
    }

    public static IConstantExpressionFactory GetFactory() {

        if (__instance == null) {

            __instance = new ConstantExpressionFactory();
        }
        return __instance;
    }

    @Override
    public IntegerConstantExpression Integer(Integer value) {
        return new IntegerConstantExpression(value);
    }

    @Override
    public DoubleConstantExpression Double(Double value) {
        return new DoubleConstantExpression(value);
    }

    @Override
    public ByteConstantExpression Byte(Byte value) {
        return new ByteConstantExpression(value);
    }

    @Override
    public BooleanConstantExpression Boolean(Boolean value) {
        return new BooleanConstantExpression(value);
    }

    @Override
    public FloatConstantExpression Float(Float value) {
        return new FloatConstantExpression(value);
    }

    @Override
    public StringConstantExpression String(String value) {
        return new StringConstantExpression(value);
    }

    @Override
    public CharacterConstantExpression Char(Character value) {
        return new CharacterConstantExpression(value);
    }

    @Override
    public DateTimeConstantExpression DateTime(Time value) {
        return new DateTimeConstantExpression(value);
    }

}
