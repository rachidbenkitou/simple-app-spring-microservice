package com.wecouldcode.productservices.mapper;

import com.wecouldcode.productservices.dto.ProductRequestDTO;
import com.wecouldcode.productservices.dto.ProductResponseDTO;
import com.wecouldcode.productservices.entity.Product;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface ProductMapper {
    ProductResponseDTO modelToDto(Product product);
    List<ProductResponseDTO> modelToDtos(List<Product> products);
    Product dtoToModel(ProductRequestDTO productRequestDTO);
}