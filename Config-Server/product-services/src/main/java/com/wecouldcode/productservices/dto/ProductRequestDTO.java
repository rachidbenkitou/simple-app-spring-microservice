package com.wecouldcode.productservices.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProductRequestDTO implements Serializable {
    private int productId;
    private String productName;
    private String productQuantity;
    private int categoryId;

}