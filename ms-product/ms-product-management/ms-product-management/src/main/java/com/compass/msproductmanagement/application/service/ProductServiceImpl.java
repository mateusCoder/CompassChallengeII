package com.compass.msproductmanagement.application.service;

import com.compass.msproductmanagement.application.port.in.ProductUseCase;
import com.compass.msproductmanagement.application.port.out.ApiProductsPortOut;
import com.compass.msproductmanagement.domain.dto.ProductRequest;
import com.compass.msproductmanagement.domain.dto.ProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductUseCase {

    private final ApiProductsPortOut apiProductsPortOut;

    @Override
    public ResponseEntity<List<ProductResponse>> findAllProducts() {
        return apiProductsPortOut.findAllProducts();
    }

    @Override
    public ResponseEntity<ProductResponse> findProductById(String productId) {
        return apiProductsPortOut.findProductById(productId);
    }

    @Override
    public ResponseEntity<List<ProductResponse>> findProductByFilters(Double minPrice, Double maxPrice, String query) {
        return apiProductsPortOut.findProductByFilters(minPrice, maxPrice, query);
    }

    @Override
    public ResponseEntity<ProductResponse> createProduct(ProductRequest productRequest) {
        return apiProductsPortOut.createProduct(productRequest);
    }

    @Override
    public ResponseEntity<ProductResponse> updateProductById(String id, ProductRequest productRequest) {
        return apiProductsPortOut.updateProductById(id, productRequest);
    }

    @Override
    public ResponseEntity<ProductResponse> deleteProduct(String id) {
        return apiProductsPortOut.deleteProduct(id);
    }

}
