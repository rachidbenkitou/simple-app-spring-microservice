package com.wecouldcode.productservices.controller;

import com.wecouldcode.productservices.controller.api.ProductApi;
import com.wecouldcode.productservices.dto.ProductRequestDTO;
import com.wecouldcode.productservices.dto.ProductResponseDTO;
import com.wecouldcode.productservices.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController implements ProductApi {
    private final ProductService service;
    @Override
    public ResponseEntity<List<ProductResponseDTO>> getProducts() {
        return new ResponseEntity<>(service.getProducts(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<ProductResponseDTO>> getProductsByName(String productName) {
        return new ResponseEntity<>(service.getProductsByName(productName), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ProductResponseDTO> addProduct(ProductRequestDTO productRequestDTO) {
        return new ResponseEntity<>(service.addProduct(productRequestDTO), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<?> deletProductByName(String productName) {
        service.deletProductByName(productName);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}