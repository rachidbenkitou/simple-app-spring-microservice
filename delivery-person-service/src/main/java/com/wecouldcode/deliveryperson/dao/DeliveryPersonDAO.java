package com.wecouldcode.deliveryperson.dao;

import com.wecouldcode.deliveryperson.entity.DeliveryPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryPersonDAO extends JpaRepository<DeliveryPerson, Integer> {
    boolean existsByDeliveryPersonId(int id);
}
