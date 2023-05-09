package com.compass.msproductmanagement.adapter.out.config;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "ms-product", url = "http://localhost:9999/products/")
public interface FeignClientConfig {
}
