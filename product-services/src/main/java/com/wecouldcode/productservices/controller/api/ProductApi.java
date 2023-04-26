package com.wecouldcode.productservices.controller.api;

import com.wecouldcode.productservices.dto.ProductRequestDTO;
import com.wecouldcode.productservices.dto.ProductResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/products")
public interface ProductApi {
    @GetMapping
    ResponseEntity<List<ProductResponseDTO>> getProducts();
    @GetMapping("/{productName}")
    ResponseEntity<List<ProductResponseDTO>> getProductsByName(@PathVariable String productName);
    @PostMapping
    ResponseEntity<ProductResponseDTO> addProduct(@RequestBody ProductRequestDTO productRequestDTO);
    @DeleteMapping("/{productName}")
    ResponseEntity<?> deletProductByName(@PathVariable String productName);
}
