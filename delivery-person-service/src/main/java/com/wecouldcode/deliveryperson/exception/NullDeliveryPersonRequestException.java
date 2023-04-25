package com.wecouldcode.deliveryperson.exception;

import com.wecouldcode.deliveryperson.shared.ApiBasedException;
import org.springframework.http.HttpStatus;

public class NullDeliveryPersonRequestException extends ApiBasedException {

    public NullDeliveryPersonRequestException(String message) {
        super(message);
    }
    @Override
    public HttpStatus getStatusCode() {
        return HttpStatus.BAD_REQUEST;
    }
}
