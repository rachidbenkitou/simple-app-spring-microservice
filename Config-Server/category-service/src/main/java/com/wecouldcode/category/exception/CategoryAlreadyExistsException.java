package com.wecouldcode.category.exception;

import com.wecouldcode.category.shared.ApiBasedException;
import org.springframework.http.HttpStatus;

public class CategoryAlreadyExistsException extends ApiBasedException {

    public CategoryAlreadyExistsException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getStatusCode() {
        return HttpStatus.CONFLICT;
    }
}
