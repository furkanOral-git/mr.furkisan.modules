package com.mrfurkisan.core.models;

public interface IValueObject<TValue> {
    
    public TValue get_Value();

    public boolean compareValueWith(IValueObject<TValue> obj);
}
