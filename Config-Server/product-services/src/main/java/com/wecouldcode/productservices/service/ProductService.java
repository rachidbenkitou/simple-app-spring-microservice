package com.wecouldcode.productservices.service;

import com.wecouldcode.productservices.dto.ProductRequestDTO;
import com.wecouldcode.productservices.dto.ProductResponseDTO;

import java.util.List;

public interface ProductService {
    ProductResponseDTO addProduct(ProductRequestDTO productRequestDTO);
    List<ProductResponseDTO> getProducts();
    List<ProductResponseDTO> getProductsByName(String productName);
    void deletProductByName(String productName);
}