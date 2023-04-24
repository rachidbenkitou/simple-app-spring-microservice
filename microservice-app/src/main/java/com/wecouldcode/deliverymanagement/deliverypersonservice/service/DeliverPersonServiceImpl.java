package com.wecouldcode.deliverymanagement.deliverypersonservice.service;

import com.wecouldcode.deliverymanagement.deliverypersonservice.dto.DeliveryPersonRequestDTO;
import com.wecouldcode.deliverymanagement.deliverypersonservice.dto.DeliveryPersonResponseDTO;

import java.util.List;

public interface DeliverPersonService {
    DeliveryPersonResponseDTO addDeliveryPerson(DeliveryPersonRequestDTO requestDTO);
    DeliveryPersonResponseDTO getDeliveryPersonById(int deliveryPersonId);
    List<DeliveryPersonResponseDTO> getDeliveryPersons();
}
