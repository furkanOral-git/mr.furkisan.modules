package com.mrfurkisan.core.expression.constants;

import java.sql.Time;

import com.mrfurkisan.core.expression.base.ConstantExpression;

public class DateTimeConstantExpression extends ConstantExpression<Time> {

    public DateTimeConstantExpression(Time value) {
        super(value);
    }

}
