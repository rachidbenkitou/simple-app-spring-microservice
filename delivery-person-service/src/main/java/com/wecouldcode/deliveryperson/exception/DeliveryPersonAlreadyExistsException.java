package com.wecouldcode.deliveryperson.exception;

import com.wecouldcode.deliveryperson.shared.ApiBasedException;
import org.springframework.http.HttpStatus;

public class DeliveryPersonAlreadyExistsException extends ApiBasedException {

    public DeliveryPersonAlreadyExistsException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getStatusCode() {
        return HttpStatus.CONFLICT;
    }
}
