package com.springboot.test1.Service.impl;

import com.springboot.test1.Service.ProductService;
import com.springboot.test1.data.dao.ProductDAO;
import com.springboot.test1.data.dto.ProductDto;
import com.springboot.test1.data.dto.ProductResponseDto;
import com.springboot.test1.data.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductDAO productDAO;

    @Autowired
    public ProductServiceImpl(ProductDAO productDAO){
        this.productDAO = productDAO;
    }

    @Override
    public ProductResponseDto getProduct(Long number){
        Product product = productDAO.selectProduct(number);
        ProductResponseDto productResponseDto = new ProductResponseDto();
        productResponseDto.setNumber(product.getNumber());
        productResponseDto.setName(product.getName());
        productResponseDto.setPrice(product.getPrice());
        productResponseDto.setStock((product.getStock()));

        return productResponseDto;
    }
    @Override
    public ProductResponseDto saveProduct(ProductDto productDto){
        Product product = new Product();

        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        product.setStock((productDto.getStock()));
        product.setCreatedAt(LocalDateTime.now());
        product.setUpdatedAt(LocalDateTime.now());

        Product saveProduct = productDAO.insertProduct(product);

        ProductResponseDto productResponseDto = new ProductResponseDto();
        productResponseDto.setNumber(saveProduct.getNumber());
        productResponseDto.setName(saveProduct.getName());
        productResponseDto.setPrice(saveProduct.getPrice());
        productResponseDto.setStock((saveProduct.getStock()));
        return productResponseDto;
    }
    @Override
    public ProductResponseDto changeProductName(Long number, String name) throws  Exception{
        Product changeProduct = productDAO.updateProductName(number,name);

        ProductResponseDto productResponseDto = new ProductResponseDto();
        productResponseDto.setNumber(changeProduct.getNumber());
        productResponseDto.setName(changeProduct.getName());
        productResponseDto.setPrice(changeProduct.getPrice());
        productResponseDto.setStock((changeProduct.getStock()));
        return productResponseDto;
    }
    @Override
    public void deleteProduct(Long number)throws Exception{
        productDAO.deleteProduct(number);
    }
}
