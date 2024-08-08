package com.mrfurkisan.core.contracts.pagination;

import com.mrfurkisan.core.requests.DataResponse;

public abstract class PaginatedDataResponse<TData> extends DataResponse<Page<TData>> {

    public PaginatedDataResponse(boolean isSuccess, String message, Page<TData> data) {

        super(isSuccess, message, data);

    }

}
