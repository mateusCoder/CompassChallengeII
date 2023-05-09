package com.compass.msproductmanagement.adapter.in;

import com.compass.msproductmanagement.application.service.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/productInventory/productManagement/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductServiceImpl service;

}
