package com.compass.msproductmanagement.adapter.out;

import com.compass.msproductmanagement.adapter.out.client.FeignClientConfig;
import com.compass.msproductmanagement.application.port.out.ProductServiceOut;
import com.compass.msproductmanagement.domain.dto.ProductRequest;
import com.compass.msproductmanagement.domain.dto.ProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImplOut implements ProductServiceOut {

    private final FeignClientConfig feignClient;

    @Override
    public ResponseEntity<List<ProductResponse>> findAllProducts() {
        return feignClient.findAllProducts();
    }

    @Override
    public ResponseEntity<ProductResponse> findProductById(String productId) {
        return feignClient.findByProductId(productId);
    }

    @Override
    public ResponseEntity<List<ProductResponse>> findProductByFilters(Double minPrice, Double maxPrice, String query) {
        return feignClient.findProductByFilters(minPrice, maxPrice, query);
    }

    @Override
    public ResponseEntity<ProductResponse> createProduct(ProductRequest productRequest) {
        return feignClient.createProduct(productRequest);
    }

    @Override
    public ResponseEntity<ProductResponse> updateProductById(String id, ProductRequest productRequest) {
        return feignClient.updateProductById(id, productRequest);
    }

    @Override
    public ResponseEntity<ProductResponse> deleteProduct(String id) {
        return feignClient.deleteProduct(id);
    }

}
