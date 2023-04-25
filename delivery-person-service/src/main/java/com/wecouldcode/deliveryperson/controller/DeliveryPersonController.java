
package com.wecouldcode.deliveryperson.controller;

import com.wecouldcode.deliveryperson.dto.DeliveryPersonRequestDTO;
import com.wecouldcode.deliveryperson.dto.DeliveryPersonResponseDTO;
import com.wecouldcode.deliveryperson.service.DeliverPersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class DeliveryPersonController implements DeliveryPersonApi {
    private final DeliverPersonService service;
    @Override
    public ResponseEntity<List<DeliveryPersonResponseDTO>> getDeliveryPersons() {
        return new ResponseEntity<>(service.getDeliveryPersons(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<DeliveryPersonResponseDTO> getDeliveryPersonById(@PathVariable int id) {
        return new ResponseEntity<>(service.getDeliveryPersonById(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<DeliveryPersonResponseDTO> addDeliveryPerson(@RequestBody DeliveryPersonRequestDTO requestDTO) {
        return new ResponseEntity<>(service.addDeliveryPerson(requestDTO), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<?> deleteDeliveryPerson(@PathVariable int id) {
        service.deleteDeliveryPersonById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
