package com.mrfurkisan.core.functional;


@FunctionalInterface
public interface IFunc<TParameter, TResponse> {
    public TResponse exec(TParameter param);
}
