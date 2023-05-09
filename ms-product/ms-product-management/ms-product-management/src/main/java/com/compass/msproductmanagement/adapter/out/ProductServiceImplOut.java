package com.compass.msproductmanagement.adapter.out;

import com.compass.msproductmanagement.adapter.out.config.FeignClientConfig;
import com.compass.msproductmanagement.application.port.out.ProductServiceOut;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImplOut implements ProductServiceOut {

    private final FeignClientConfig feignClient;
}
