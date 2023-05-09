package com.compass.msproductmanagement.application.service;

import com.compass.msproductmanagement.application.port.out.ApiProductsPortOut;
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

class ProductServiceImplTest {

    @InjectMocks
    private ProductServiceImpl productService;

    @Mock
    private ApiProductsPortOut apiProductsPortOut;

    private static final String ID = "1";

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void findAllProducts_WhenSendRequestAll_ExpectedSuccess() {
        when(apiProductsPortOut.findAllProducts()).thenReturn(ProductScenarioFactory.getListResponseEntityProductResponse());

        var response = productService.findAllProducts();

        assertNotNull(response);
        assertEquals(HttpStatus.OK.value(), response.getStatusCode().value());
        assertEquals(ProductScenarioFactory.getListResponseEntityProductResponse().getBody().get(0).getId(), response.getBody().get(0).getId());
    }

    @Test
    void findProductById_WhenSendProductId_ExpectedSuccess() {
        when(apiProductsPortOut.findProductById(anyString())).thenReturn(ProductScenarioFactory.getResponseEntityProductResponse());

        var response = productService.findProductById(ID);

        assertNotNull(response);
        assertEquals(HttpStatus.OK.value(), response.getStatusCode().value());
        assertEquals(ProductScenarioFactory.getResponseEntityProductResponse().getBody().getId(), response.getBody().getId());
    }

    @Test
    void findProductByFilters_WhenSendFiltersOfProduct_ExpectedSuccess() {
        when(apiProductsPortOut.findProductByFilters(any(), any(), any())).thenReturn(ProductScenarioFactory.getListResponseEntityProductResponse());

        var response = productService.findProductByFilters((double) 0, (double) 300, "");

        assertNotNull(response);
        assertEquals(HttpStatus.OK.value(), response.getStatusCode().value());
        assertEquals(ProductScenarioFactory.getListResponseEntityProductResponse().getBody().get(0).getId(), response.getBody().get(0).getId());
    }

    @Test
    void createProduct_WhenSendProductRequest_ExpectedSuccess() {
        when(apiProductsPortOut.createProduct(any())).thenReturn(ProductScenarioFactory.getResponseEntityProductResponse());

        var response = productService.createProduct(ProductScenarioFactory.getResponseEntityProductRequest().getBody());

        assertNotNull(response);
        assertEquals(HttpStatus.OK.value(), response.getStatusCode().value());
        assertEquals(ProductScenarioFactory.getResponseEntityProductResponse().getBody().getId(), response.getBody().getId());
    }

    @Test
    void updateProductById_WhenSendProductIdAndProductRequest_ExpectedSuccess() {
        when(apiProductsPortOut.updateProductById(anyString(), any())).thenReturn(ProductScenarioFactory.getResponseEntityProductResponse());

        var response = productService.updateProductById(ID, ProductScenarioFactory.getResponseEntityProductRequest().getBody());

        assertNotNull(response);
        assertEquals(HttpStatus.OK.value(), response.getStatusCode().value());
        assertEquals(ProductScenarioFactory.getResponseEntityProductResponse().getBody().getId(), response.getBody().getId());
    }

    @Test
    void deleteProduct_WhenSendProductId_ExpectedSuccess() {
        when(apiProductsPortOut.deleteProduct(anyString())).thenReturn(ProductScenarioFactory.getResponseEntityProductResponse());

        var response = productService.deleteProduct(ID);

        assertNotNull(response);
        assertEquals(HttpStatus.OK.value(), response.getStatusCode().value());
        assertEquals(ProductScenarioFactory.getResponseEntityProductResponse().getBody().getId(), response.getBody().getId());
    }
}