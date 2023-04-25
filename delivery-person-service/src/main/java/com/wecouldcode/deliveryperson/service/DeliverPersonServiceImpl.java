package com.wecouldcode.deliveryperson.service;

import com.wecouldcode.deliveryperson.dao.DeliveryPersonDAO;
import com.wecouldcode.deliveryperson.dto.DeliveryPersonRequestDTO;
import com.wecouldcode.deliveryperson.dto.DeliveryPersonResponseDTO;
import com.wecouldcode.deliveryperson.entity.DeliveryPerson;
import com.wecouldcode.deliveryperson.exception.DeliveryPersonAlreadyExistsException;
import com.wecouldcode.deliveryperson.exception.DeliveryPersonListEmptyException;
import com.wecouldcode.deliveryperson.exception.DeliveryPersonNotFoundException;
import com.wecouldcode.deliveryperson.exception.NullDeliveryPersonRequestException;
import com.wecouldcode.deliveryperson.mapper.DeliveryPersonMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class DeliverPersonServiceImpl implements DeliverPersonService{
    private final DeliveryPersonMapper mapper;
    private final DeliveryPersonDAO dao;
    @Override
    public DeliveryPersonResponseDTO addDeliveryPerson(DeliveryPersonRequestDTO requestDTO) {
        if (requestDTO==null) throw new NullDeliveryPersonRequestException("The request sent is null.");
        if(dao.existsByDeliveryPersonId(requestDTO.getDeliveryPersonId())==true)
            throw new DeliveryPersonAlreadyExistsException(String.format("The delivery person with this id {%d} is already exists.",requestDTO.getDeliveryPersonId()));
        DeliveryPerson deliveryPerson= mapper.dtoToModel(requestDTO);
        return mapper.modelToDto(dao.save(deliveryPerson));
    }
    @Override
    public DeliveryPersonResponseDTO getDeliveryPersonById(int deliveryPersonId) {
        DeliveryPerson deliveryPerson=dao.findById(deliveryPersonId).orElseThrow(() ->
                new DeliveryPersonNotFoundException(String.format("The delivery person with the id {%d} is not found.", deliveryPersonId)));
        return mapper.modelToDto(deliveryPerson);
    }
    @Override
    public List<DeliveryPersonResponseDTO> getDeliveryPersons() {
        List<DeliveryPersonResponseDTO> deliveryPersonResponseDTOS=
                mapper.modelToDtos(dao.findAll());
        if(deliveryPersonResponseDTOS.isEmpty())
            throw  new DeliveryPersonListEmptyException(String.format("The list is empty, no delivery person exits"));
        return deliveryPersonResponseDTOS;
    }
    @Override
    public void deleteDeliveryPersonById(int id) {
        dao.deleteById(id);
    }
}
