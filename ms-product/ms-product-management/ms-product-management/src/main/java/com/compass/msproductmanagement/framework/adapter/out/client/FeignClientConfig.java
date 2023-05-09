package com.compass.msproductmanagement.framework.adapter.out.client;

import com.compass.msproductmanagement.domain.dto.ProductRequest;
import com.compass.msproductmanagement.domain.dto.ProductResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "ms-catalog", url = "http://localhost:9999/products")
public interface FeignClientConfig {

    @GetMapping()
    ResponseEntity<List<ProductResponse>> findAllProducts();

    @GetMapping("/{id}")
    ResponseEntity<ProductResponse> findByProductId(@PathVariable String id);

    @GetMapping("/search")
    ResponseEntity<List<ProductResponse>> findProductByFilters(@RequestParam(value = "min_price", defaultValue = "") Double minPrice,
                                                                      @RequestParam(value = "max_price", defaultValue = "") Double maxPrice,
                                                                      @RequestParam(value = "q", defaultValue = "") String query);

    @PostMapping()
    ResponseEntity<ProductResponse> createProduct(@RequestBody ProductRequest productRequest);

    @PutMapping("/{id}")
    ResponseEntity<ProductResponse> updateProductById(@PathVariable String id, @RequestBody ProductRequest productRequest);

    @DeleteMapping("/{id}")
    ResponseEntity<ProductResponse> deleteProduct(@PathVariable String id);

}
