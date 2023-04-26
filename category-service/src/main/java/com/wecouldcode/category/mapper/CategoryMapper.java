package com.wecouldcode.category.mapper;

import com.wecouldcode.category.dto.CategoryRequestDTO;
import com.wecouldcode.category.dto.CategoryResponseDTO;
import com.wecouldcode.category.entity.Category;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryResponseDTO modelToDto(Category category);
    List<CategoryResponseDTO> modelToDtos(List<Category> categoryList);
    Category dtoToModel(CategoryRequestDTO requestDTO);
}
