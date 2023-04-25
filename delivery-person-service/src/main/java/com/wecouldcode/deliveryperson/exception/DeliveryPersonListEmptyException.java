package com.wecouldcode.deliveryperson.exception;

import com.wecouldcode.deliveryperson.shared.ApiBasedException;
import org.springframework.http.HttpStatus;

public class DeliveryPersonListEmptyException extends ApiBasedException {

    public DeliveryPersonListEmptyException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getStatusCode() {
        return HttpStatus.NOT_FOUND;
    }
}
