package com.mrfurkisan.core.requests;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public abstract class Response {

    private final boolean isSuccess;
    private final String message;

}
