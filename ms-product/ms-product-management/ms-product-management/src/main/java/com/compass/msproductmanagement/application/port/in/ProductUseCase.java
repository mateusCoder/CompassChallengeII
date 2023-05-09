package com.compass.msproductmanagement.application.port.in;

import com.compass.msproductmanagement.domain.dto.ProductRequest;
import com.compass.msproductmanagement.domain.dto.ProductResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductUseCase {

    ResponseEntity<ProductResponse> findProductById(String productId);

    ResponseEntity<List<ProductResponse>> findAllProducts();

    ResponseEntity<List<ProductResponse>> findProductByFilters(Double minPrice, Double maxPrice, String query);

    ResponseEntity<ProductResponse> createProduct(ProductRequest productRequest);

    ResponseEntity<ProductResponse> updateProductById(String id, ProductRequest productRequest);

    ResponseEntity<ProductResponse> deleteProduct(String id);
}
