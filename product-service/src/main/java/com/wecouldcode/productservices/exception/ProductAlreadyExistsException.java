package com.wecouldcode.productservices.exception;

import com.wecouldcode.productservices.shared.ApiBasedException;
import org.springframework.http.HttpStatus;

public class ProductAlreadyExistsException extends ApiBasedException {
    public ProductAlreadyExistsException(String message) {
        super(message);
    }
    @Override
    public HttpStatus getStatusCode() {
        return HttpStatus.NOT_FOUND;
    }
}

