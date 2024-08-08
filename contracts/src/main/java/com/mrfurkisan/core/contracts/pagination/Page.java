package com.mrfurkisan.core.contracts.pagination;

import java.util.List;

import lombok.Getter;
import lombok.RequiredArgsConstructor;




@RequiredArgsConstructor
@Getter
public class Page<TData> {

    private final List<TData> data;
    private final int pageSize;
    private final int pageNumber;
    private final boolean hasNext;
    private final boolean hasPrevious;
    private final int totalPage;

}
