package com.wecouldcode.deliveryperson.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryPersonResponseDTO implements Serializable {
    private int deliveryPersonId;
    private String deliveryPersonName;
    private String deliveryPersonPhone;
}
