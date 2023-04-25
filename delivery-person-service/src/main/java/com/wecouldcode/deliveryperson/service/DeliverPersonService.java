package com.wecouldcode.deliveryperson.service;

import com.wecouldcode.deliveryperson.dto.DeliveryPersonRequestDTO;
import com.wecouldcode.deliveryperson.dto.DeliveryPersonResponseDTO;

import java.util.List;

public interface DeliverPersonService {
    DeliveryPersonResponseDTO addDeliveryPerson(DeliveryPersonRequestDTO requestDTO);
    DeliveryPersonResponseDTO getDeliveryPersonById(int deliveryPersonId);
    List<DeliveryPersonResponseDTO> getDeliveryPersons();
    void  deleteDeliveryPersonById(int id);
}
