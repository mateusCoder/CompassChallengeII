package com.compass.msproductmanagement.application.port.out;

import com.compass.msproductmanagement.domain.dto.ProductRequest;
import com.compass.msproductmanagement.domain.dto.ProductResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ApiProductsPortOut {

    ResponseEntity<List<ProductResponse>> findAllProducts();

    ResponseEntity<ProductResponse> findProductById(String productId);

    ResponseEntity<List<ProductResponse>> findProductByFilters(Double minPrice, Double maxPrice, String query);

    ResponseEntity<ProductResponse> createProduct(ProductRequest productRequest);

    ResponseEntity<ProductResponse> updateProductById(String id, ProductRequest productRequest);

    ResponseEntity<ProductResponse> deleteProduct(String id);

}
