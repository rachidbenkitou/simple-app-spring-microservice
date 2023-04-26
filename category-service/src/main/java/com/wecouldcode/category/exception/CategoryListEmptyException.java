package com.wecouldcode.category.exception;

import com.wecouldcode.category.shared.ApiBasedException;
import org.springframework.http.HttpStatus;

public class CategoryListEmptyException extends ApiBasedException {

    public CategoryListEmptyException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getStatusCode() {
        return HttpStatus.NOT_FOUND;
    }
}
