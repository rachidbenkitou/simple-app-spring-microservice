package com.wecouldcode.deliverymanagement.deliverypersonservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryPerson implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int deliveryPersonId;
    private String deliveryPersonName;
    private String deliveryPersonPhone;
}
