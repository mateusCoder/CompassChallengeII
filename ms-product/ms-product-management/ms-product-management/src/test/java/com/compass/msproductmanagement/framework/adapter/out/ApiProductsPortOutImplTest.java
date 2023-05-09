package com.compass.msproductmanagement.framework.adapter.out;

import com.compass.msproductmanagement.framework.adapter.out.client.FeignClientConfig;
import com.compass.msproductmanagement.scenarioFactory.ProductScenarioFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

class ApiProductsPortOutImplTest {

    @InjectMocks
    private ApiProductsPortOutImpl apiProductsPortOut;

    @Mock
    FeignClientConfig feignClient;

    private static final String ID = "1";

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void findAllProducts_WhenSendRequest_ExpectedSuccess() {
        when(feignClient.findAllProducts()).thenReturn(ProductScenarioFactory.getListResponseEntityProductResponse());

        var response = apiProductsPortOut.findAllProducts();

        assertNotNull(response);
        assertEquals(HttpStatus.OK.value(), response.getStatusCode().value());
        assertEquals(ProductScenarioFactory.getListResponseEntityProductResponse().getBody().get(0).getId(), response.getBody().get(0).getId());
    }

    @Test
    void findProductById_WhenSendProductId_ExpectedSuccess() {
        when(feignClient.findByProductId(anyString())).thenReturn(ProductScenarioFactory.getResponseEntityProductResponse());

        var response = apiProductsPortOut.findProductById(ID);

        assertNotNull(response);
        assertEquals(HttpStatus.OK.value(), response.getStatusCode().value());
        assertEquals(ProductScenarioFactory.getResponseEntityProductResponse().getBody().getId(), response.getBody().getId());
    }

    @Test
    void findProductByFilters_WhenSendProductFilters_ExpectedSuccess() {
        when(feignClient.findProductByFilters(any(), any(), any())).thenReturn(ProductScenarioFactory.getListResponseEntityProductResponse());

        var response = apiProductsPortOut.findProductByFilters((double) 0, (double) 300, "");

        assertNotNull(response);
        assertEquals(HttpStatus.OK.value(), response.getStatusCode().value());
        assertEquals(ProductScenarioFactory.getListResponseEntityProductResponse().getBody().get(0).getId(), response.getBody().get(0).getId());
    }

    @Test
    void createProduct_WhenSendProductRequest_ExpectedSuccess() {
        when(feignClient.createProduct(any())).thenReturn(ProductScenarioFactory.getResponseEntityProductResponse());

        var response = apiProductsPortOut.createProduct(ProductScenarioFactory.getResponseEntityProductRequest().getBody());

        assertNotNull(response);
        assertEquals(HttpStatus.OK.value(), response.getStatusCode().value());
        assertEquals(ProductScenarioFactory.getResponseEntityProductResponse().getBody().getId(), response.getBody().getId());
    }

    @Test
    void updateProductById_WhenSendProductIdAndProductRequest_ExpectedSuccess() {
        when(feignClient.updateProductById(anyString(), any())).thenReturn(ProductScenarioFactory.getResponseEntityProductResponse());

        var response = apiProductsPortOut.updateProductById(ID, ProductScenarioFactory.getResponseEntityProductRequest().getBody());

        assertNotNull(response);
        assertEquals(HttpStatus.OK.value(), response.getStatusCode().value());
        assertEquals(ProductScenarioFactory.getResponseEntityProductResponse().getBody().getId(), response.getBody().getId());
    }

    @Test
    void deleteProduct_WhenSendProductId_ExpectedSuccess() {
        when(feignClient.deleteProduct(anyString())).thenReturn(ProductScenarioFactory.getResponseEntityProductResponse());

        var response = apiProductsPortOut.deleteProduct(ID);

        assertNotNull(response);
        assertEquals(HttpStatus.OK.value(), response.getStatusCode().value());
        assertEquals(ProductScenarioFactory.getResponseEntityProductResponse().getBody().getId(), response.getBody().getId());
    }
}