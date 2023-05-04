package com.wecouldcode.productservices.service;


import com.wecouldcode.productservices.dao.ProductDAO;
import com.wecouldcode.productservices.dto.ProductRequestDTO;
import com.wecouldcode.productservices.dto.ProductResponseDTO;
import com.wecouldcode.productservices.entity.Product;
import com.wecouldcode.productservices.exception.ProductAlreadyExistsException;
import com.wecouldcode.productservices.exception.ProductNotFoundException;
import com.wecouldcode.productservices.exception.ProductNullEception;
import com.wecouldcode.productservices.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ProductServiceImpl implements ProductService{
    private final ProductDAO dao;
    private final ProductMapper mapper;
    @Override
    public ProductResponseDTO addProduct(ProductRequestDTO productRequestDTO) {
        if (dao.existsByProductName(productRequestDTO.getProductName()))
            throw  new ProductAlreadyExistsException(String.format("the product %s is already exists.", productRequestDTO.getProductName()));
        ProductResponseDTO savedProduct=mapper.modelToDto(dao.save(mapper.dtoToModel(productRequestDTO)));
        if (savedProduct==null)
            throw new ProductNullEception("The request given is null");
        return savedProduct;
    }

    @Override
    public List<ProductResponseDTO> getProducts() {
        return getListOfResponseProdcuts(dao.findAll());
    }

    @Override
    public List<ProductResponseDTO> getProductsByName(String productName) {
        return getListOfResponseProdcuts(dao.findProductsByProductNameLikeIgnoreCase(productName));
    }

    private List<ProductResponseDTO> getListOfResponseProdcuts(List<Product> products){
        //List<Product> products=dao.findAll();
        if(products.isEmpty())
            throw new ProductNotFoundException("The list of products is empty.");
        return  mapper.modelToDtos(products);
    }
    @Override
    public void deletProductByName(String productName) {
        dao.deleteByProductName(productName);
    }
}

