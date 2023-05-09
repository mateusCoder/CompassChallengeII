package com.compass.msproductmanagement.adapter.in;

import com.compass.msproductmanagement.application.service.ProductServiceImpl;
import com.compass.msproductmanagement.domain.dto.ProductRequest;
import com.compass.msproductmanagement.domain.dto.ProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/productInventory/productManagement/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductServiceImpl service;

    @GetMapping()
    public ResponseEntity<List<ProductResponse>> findAll(){
        return service.findAllProducts();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProductResponse> findById(@PathVariable String id){
        return service.findProductById(id);
    }

    @GetMapping(value = "/search")
    public ResponseEntity<List<ProductResponse>> findByFilters(@RequestParam(value = "min_price", defaultValue = "") Double minPrice,
                                                               @RequestParam(value = "max_price", defaultValue = "") Double maxPrice,
                                                               @RequestParam(value = "q", defaultValue = "") String query){
        return service.findProductByFilters(minPrice, maxPrice, query);
    }

    @PostMapping
    public ResponseEntity<ProductResponse> createProduct(@RequestBody ProductRequest productRequest){
        return service.createProduct(productRequest);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ProductResponse> updateProductById(@PathVariable String id, @RequestBody ProductRequest productRequest){
        return service.updateProductById(id, productRequest);
    }

    @DeleteMapping(value = "/{id}")
    ResponseEntity<ProductResponse> deleteProduct(@PathVariable String id){
        return service.deleteProduct(id);
    }

}
