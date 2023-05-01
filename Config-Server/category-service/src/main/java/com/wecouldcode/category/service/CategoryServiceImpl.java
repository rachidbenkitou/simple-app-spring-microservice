package com.wecouldcode.category.service;

import com.wecouldcode.category.dao.CategoryDAO;
import com.wecouldcode.category.dto.CategoryRequestDTO;
import com.wecouldcode.category.dto.CategoryResponseDTO;
import com.wecouldcode.category.entity.Category;
import com.wecouldcode.category.exception.CategoryAlreadyExistsException;
import com.wecouldcode.category.exception.CategoryListEmptyException;
import com.wecouldcode.category.exception.CategoryNotFoundException;
import com.wecouldcode.category.exception.NullCategoryRequestException;
import com.wecouldcode.category.mapper.CategoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryMapper mapper;
    private final CategoryDAO dao;
    @Override
    public CategoryResponseDTO addCategory(CategoryRequestDTO requestDTO) {
        if (requestDTO==null) throw new NullCategoryRequestException("The request sent is null.");
        if(dao.existsByCategoryName(requestDTO.getCategoryName())==true)
            throw new CategoryAlreadyExistsException(String.format("The category %s is already exists.",requestDTO.getCategoryName()));
        Category category = mapper.dtoToModel(requestDTO);
        return mapper.modelToDto(dao.save(category));
    }
    @Override
    public CategoryResponseDTO getCategoryByName(String categoryName) {
        Category category =dao.findByCategoryName(categoryName).orElseThrow(() ->
                new CategoryNotFoundException(String.format("The category %s is not found.", categoryName)));
        return mapper.modelToDto(category);
    }
    @Override
    public List<CategoryResponseDTO> getCategories() {
        List<CategoryResponseDTO> categoryResponseDTOS =
                mapper.modelToDtos(dao.findAll());
        if(categoryResponseDTOS.isEmpty())
            throw  new CategoryListEmptyException(String.format("The list is empty, no category exits"));
        return categoryResponseDTOS;
    }
    @Override
    public void deleteCategoryById(int id) {
        dao.deleteById(id);
    }
}
