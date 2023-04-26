package com.wecouldcode.category.service;

import com.wecouldcode.category.dto.CategoryRequestDTO;
import com.wecouldcode.category.dto.CategoryResponseDTO;

import java.util.List;

public interface CategoryService {
    CategoryResponseDTO addCategory(CategoryRequestDTO requestDTO);
    CategoryResponseDTO getCategoryByName(String categoryName);
    List<CategoryResponseDTO> getCategories();
    void  deleteCategoryById(int id);
}
