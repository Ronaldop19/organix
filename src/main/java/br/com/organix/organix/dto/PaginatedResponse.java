package br.com.organix.organix.dto;

import java.util.List;

public class PaginatedResponse<T> {

    private List<T> content;
    private int totalPages;
    private long totalElements;
    private int currentPage;
    private boolean isLastPage;

    public PaginatedResponse(List<T> content, int totalPages, long totalElements, int currentPage, boolean isLastPage) {
        this.content = content;
        this.totalPages = totalPages;
        this.totalElements = totalElements;
        this.currentPage = currentPage;
        this.isLastPage = isLastPage;
    }

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(long totalElements) {
        this.totalElements = totalElements;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public boolean isLastPage() {
        return isLastPage;
    }

    public void setLastPage(boolean isLastPage) {
        this.isLastPage = isLastPage;
    }
}
