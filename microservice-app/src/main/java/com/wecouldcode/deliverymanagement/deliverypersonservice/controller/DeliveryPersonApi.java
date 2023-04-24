package com.wecouldcode.deliverymanagement.deliverypersonservice.controller;

import com.wecouldcode.deliverymanagement.deliverypersonservice.dto.DeliveryPersonResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/delivery-person")
public interface DeliveryPerson {
    @GetMapping
    ResponseEntity<List<DeliveryPersonResponseDTO>> getDeliveryPersons();
}
