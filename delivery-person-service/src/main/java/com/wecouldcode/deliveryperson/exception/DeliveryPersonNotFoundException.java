package com.wecouldcode.deliveryperson.exception;

import com.wecouldcode.deliveryperson.shared.ApiBasedException;
import org.springframework.http.HttpStatus;

public class DeliveryPersonNotFoundException extends ApiBasedException {

    public DeliveryPersonNotFoundException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getStatusCode() {
        return HttpStatus.NOT_FOUND;
    }
}
