package com.wecouldcode.category.exception;

import com.wecouldcode.category.shared.ApiBasedException;
import org.springframework.http.HttpStatus;

public class NullCategoryRequestException extends ApiBasedException {

    public NullCategoryRequestException(String message) {
        super(message);
    }
    @Override
    public HttpStatus getStatusCode() {
        return HttpStatus.BAD_REQUEST;
    }
}
