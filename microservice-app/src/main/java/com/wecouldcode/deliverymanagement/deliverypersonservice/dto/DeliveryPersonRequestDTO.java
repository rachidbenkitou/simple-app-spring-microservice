package com.wecouldcode.deliverymanagement.deliverypersonservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryPersonRequestDTO implements Serializable {
    private String deliveryPersonName;
    private String deliveryPersonPhone;
}
