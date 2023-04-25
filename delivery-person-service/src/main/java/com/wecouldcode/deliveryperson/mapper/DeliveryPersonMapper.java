package com.wecouldcode.deliveryperson.mapper;

import com.wecouldcode.deliveryperson.dto.DeliveryPersonRequestDTO;
import com.wecouldcode.deliveryperson.dto.DeliveryPersonResponseDTO;
import com.wecouldcode.deliveryperson.entity.DeliveryPerson;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DeliveryPersonMapper {
    DeliveryPersonResponseDTO modelToDto(DeliveryPerson deliveryPerson);
    List<DeliveryPersonResponseDTO> modelToDtos(List<DeliveryPerson> deliveryPersonList);
    DeliveryPerson dtoToModel(DeliveryPersonRequestDTO requestDTO);
}
