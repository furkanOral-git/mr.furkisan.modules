package com.mrfurkisan.core.functional;

@FunctionalInterface
public interface IAction<TParameter> {
    public void exec(TParameter param);
}
