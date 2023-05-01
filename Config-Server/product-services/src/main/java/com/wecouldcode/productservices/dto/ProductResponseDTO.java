package com.wecouldcode.productservices.dto;

import com.wecouldcode.productservices.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProductResponseDTO implements Serializable {
    private int productId;
    private String productName;
    private String productQuantity;
    private Category category;
}