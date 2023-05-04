package com.wecouldcode.productservices.dao;

import com.wecouldcode.productservices.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDAO extends JpaRepository<Product, Integer> {
    void deleteByProductName(String productName);
    List<Product> findProductsByProductNameLikeIgnoreCase(String productName);
    boolean existsByProductName(String productName);
}