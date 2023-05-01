package com.wecouldcode.productservices.exception;

import com.wecouldcode.productservices.shared.ApiBasedException;
import org.springframework.http.HttpStatus;

public class ProductNotFoundException extends ApiBasedException {
    public ProductNotFoundException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getStatusCode() {
        return HttpStatus.NOT_FOUND;
    }
}
