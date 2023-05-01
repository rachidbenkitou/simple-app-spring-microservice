package com.wecouldcode.category.controller;

import com.wecouldcode.category.dto.CategoryRequestDTO;
import com.wecouldcode.category.dto.CategoryResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/categories")
public interface CategoryApi {
    @GetMapping
    ResponseEntity<List<CategoryResponseDTO>> getCategories();
    @GetMapping("/{categoryName}")
    ResponseEntity<CategoryResponseDTO> getCategoriesByName(@PathVariable String categoryName);
    @PostMapping
    ResponseEntity<CategoryResponseDTO> addCategory(@RequestBody CategoryRequestDTO requestDTO);
    @DeleteMapping("/{id}")
    ResponseEntity<?> deleteCategoryById(@PathVariable int id);
}
