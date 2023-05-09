package com.compass.msproductmanagement.application.service;

import com.compass.msproductmanagement.application.port.in.ProductService;
import com.compass.msproductmanagement.application.port.out.ProductServiceOut;
import com.compass.msproductmanagement.domain.dto.ProductRequest;
import com.compass.msproductmanagement.domain.dto.ProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductServiceOut productServiceOut;

    @Override
    public ResponseEntity<List<ProductResponse>> findAllProducts() {
        return productServiceOut.findAllProducts();
    }

    @Override
    public ResponseEntity<ProductResponse> findProductById(String productId) {
        return productServiceOut.findProductById(productId);
    }

    @Override
    public ResponseEntity<List<ProductResponse>> findProductByFilters(Double minPrice, Double maxPrice, String query) {
        return productServiceOut.findProductByFilters(minPrice, maxPrice, query);
    }

    @Override
    public ResponseEntity<ProductResponse> createProduct(ProductRequest productRequest) {
        return productServiceOut.createProduct(productRequest);
    }

    @Override
    public ResponseEntity<ProductResponse> updateProductById(String id, ProductRequest productRequest) {
        return productServiceOut.updateProductById(id, productRequest);
    }

    @Override
    public ResponseEntity<ProductResponse> deleteProduct(String id) {
        return productServiceOut.deleteProduct(id);
    }

}
