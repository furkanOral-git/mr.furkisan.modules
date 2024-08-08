package com.mrfurkisan.core.contracts;

import com.mrfurkisan.core.contracts.pagination.PaginatedDataResponse;

public class ErrorPaginatedDataResponse<TData> extends PaginatedDataResponse<TData> {

    public ErrorPaginatedDataResponse(String message) {
        
        super(false, message, null);
    }

    public ErrorPaginatedDataResponse(Exception ex) {
        
        this(ex.getMessage());
    }
    public ErrorPaginatedDataResponse(){

        this("Paginated data response error message!");
    }

}
