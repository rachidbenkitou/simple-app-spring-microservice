package com.wecouldcode.deliverymanagement.deliverypersonservice.dao;

import com.wecouldcode.deliverymanagement.deliverypersonservice.entity.DeliveryPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryPersonDAO extends JpaRepository<DeliveryPerson, Integer> {
}
