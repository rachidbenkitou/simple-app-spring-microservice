package com.wecouldcode.deliveryperson.controller;

import com.wecouldcode.deliveryperson.dto.DeliveryPersonRequestDTO;
import com.wecouldcode.deliveryperson.dto.DeliveryPersonResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/delivery-persons")
public interface DeliveryPersonApi {
    @GetMapping
    ResponseEntity<List<DeliveryPersonResponseDTO>> getDeliveryPersons();
    @GetMapping("/{id}")
    ResponseEntity<DeliveryPersonResponseDTO> getDeliveryPersonById(@PathVariable int id);
    @PostMapping
    ResponseEntity<DeliveryPersonResponseDTO> addDeliveryPerson(@RequestBody DeliveryPersonRequestDTO requestDTO);
    @DeleteMapping("/{id}")
    ResponseEntity<?> deleteDeliveryPerson(@PathVariable int id);
}
