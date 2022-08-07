package com.springboot.test1.data.dao;

import com.springboot.test1.data.repository.CommentReportRepository;
import com.springboot.test1.data.repository.PostReportRepository;
import com.springboot.test1.data.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PostReportDAO {
    private final PostReportRepository postReportRepository;
    @Autowired
    public PostReportDAO(PostReportRepository postReportRepository)
    {
        this.postReportRepository = postReportRepository;
    }

    /*
    public Product insertProduct(Product product){
        Product saveProduct = productRepository.save(product);
        return saveProduct;
    }

    public Product selectProduct(Long number){
        Product selectProduct = productRepository.getReferenceById(number);
        return selectProduct;
    }

    public Product updateProductName(Long number, String name) throws Exception{
        Optional<Product> selectedProduct = productRepository.findById(number);

        Product updatedProduct;
        if(selectedProduct.isPresent()){
            Product product = selectedProduct.get();
            product.setName(name);
            product.setUpdatedAt(LocalDateTime.now());

            updatedProduct = productRepository.save(product);
        }else{
            throw new Exception();
        }

        return updatedProduct;
    }

    public void deleteProduct(Long number) throws Exception{
        Optional<Product> selectedProduct = productRepository.findById(number);
        if(selectedProduct.isPresent()){
            Product product = selectedProduct.get();
            productRepository.delete(product);
        }else{
            throw new Exception();
        }

    }*/
}
