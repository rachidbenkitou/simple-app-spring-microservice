package com.wecouldcode.category.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryRequestDTO implements Serializable {
    private int categoryId;
    private String categoryName;
}
