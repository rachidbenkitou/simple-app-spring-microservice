package com.wecouldcode.productservices.exception;

import com.wecouldcode.productservices.shared.ApiBasedException;
import org.springframework.http.HttpStatus;

public class ProductNullEception extends ApiBasedException {

    public ProductNullEception(String message) {
        super(message);
    }

    @Override
    public HttpStatus getStatusCode() {
        return HttpStatus.BAD_REQUEST;
    }
}
