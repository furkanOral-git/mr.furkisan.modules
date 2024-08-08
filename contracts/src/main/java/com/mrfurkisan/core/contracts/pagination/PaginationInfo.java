package com.mrfurkisan.core.contracts.pagination;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class PaginationInfo {
    
    private final int totalItemCount;
    private final int pageSize;
    private final int itemCountPerPage;
    private final int totalPageCount;
    private int currentPage;
    private boolean hasNext;
    private boolean hasPrevious;
}
