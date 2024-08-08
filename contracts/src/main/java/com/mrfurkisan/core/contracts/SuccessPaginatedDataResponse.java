package com.mrfurkisan.core.contracts;

import com.mrfurkisan.core.contracts.pagination.Page;
import com.mrfurkisan.core.contracts.pagination.PaginatedDataResponse;
import com.mrfurkisan.core.models.IEntity;

public class SuccessPaginatedDataResponse<TData extends IEntity<?>> extends PaginatedDataResponse<TData> {

    public SuccessPaginatedDataResponse(String message, Page<TData> data) {
        super(true, message, data);

    }

    public SuccessPaginatedDataResponse(Page<TData> data) {

        this("Paginated data response success mesage!", data);
    }

}
