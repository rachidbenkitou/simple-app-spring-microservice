
package com.wecouldcode.category.controller;

import com.wecouldcode.category.dto.CategoryRequestDTO;
import com.wecouldcode.category.dto.CategoryResponseDTO;
import com.wecouldcode.category.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class CategoryController implements CategoryApi {
    private final CategoryService service;
    @Override
    public ResponseEntity<List<CategoryResponseDTO>> getCategories() {
        return new ResponseEntity<>(service.getCategories(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<CategoryResponseDTO> getCategoriesByName(@PathVariable String categoryName) {
        return new ResponseEntity<>(service.getCategoryByName(categoryName), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<CategoryResponseDTO> addCategory(@RequestBody CategoryRequestDTO requestDTO) {
        return new ResponseEntity<>(service.addCategory(requestDTO), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<?> deleteCategoryById(@PathVariable int id) {
        service.deleteCategoryById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
