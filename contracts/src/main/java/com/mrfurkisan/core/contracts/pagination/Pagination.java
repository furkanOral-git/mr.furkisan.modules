package com.mrfurkisan.core.contracts.pagination;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;



@Setter
@Getter
public class Pagination<TData> {

    private final List<TData> source;
    private final PaginationInfo info;

    public Pagination(List<TData> source, int pageSize) {

        super();
        this.source = source;

        int itemCount = this.source.size();
        int itemCountPerPage = Math.floorDiv(itemCount, pageSize);
        int totalPageCount = itemCount / itemCountPerPage;

        if (itemCount % itemCountPerPage > 0) {

            totalPageCount++;

        }
        this.info = new PaginationInfo(itemCount, pageSize, itemCountPerPage, totalPageCount);
    }

    public Page<TData> getPageByNumber(int pageNumber) {

        this.info.setCurrentPage(pageNumber);
        this.info.setHasNext(this.info.getCurrentPage() < this.info.getTotalPageCount());
        this.info.setHasPrevious(this.info.getCurrentPage() != 0);

        if (!this.info.isHasPrevious()) {

            return this.getPageByNumber(1);
        }

        if (!this.info.isHasNext()) {

            return this.getLastPage();
        }

        // indexleme
        List<TData> data = new ArrayList<TData>();
        int initialIndex = this.calculateInitialIndex();
        int lastIndex = this.calculateLastIndex();
        for (int i = initialIndex; i <= lastIndex; i++) {

            data.add(this.source.get(i));
        }

        return new Page<TData>(
                data,
                this.info.getPageSize(),
                this.info.getCurrentPage(),
                this.info.isHasNext(),
                this.info.isHasPrevious(),
                this.info.getTotalPageCount());
    }
    //Tamamlanmadı//
    private int calculateInitialIndex() {
        return -1;
    }

    private int calculateLastIndex() {
        return -1;
    }

    public Page<TData> getNextPage() {

        if (!this.info.isHasNext()) {

            return this.getLastPage();
        }
        return this.getPageByNumber(this.info.getCurrentPage() + 1);
    }

    public Page<TData> getPreviousPage() {

        if (!this.info.isHasPrevious()) {
            
            return this.getFirstPage();
        }
        return null;
    }

    public Page<TData> getLastPage() {

        return getPageByNumber(this.info.getTotalPageCount());
    }

    public Page<TData> getFirstPage() {

        return getPageByNumber(1);
    }

}
