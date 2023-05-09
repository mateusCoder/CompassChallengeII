package com.compass.msproductmanagement.framework.adapter.in;

import com.compass.msproductmanagement.application.service.ProductServiceImpl;
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

class ProductControllerTest {

    @InjectMocks
    private ProductController productController;

    @Mock
    private ProductServiceImpl productService;

    private final String ID = "1";

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void findAll_WhenSendRequestAll_ExpectedSuccess() {
        when(productService.findAllProducts()).thenReturn(ProductScenarioFactory.getListResponseEntityProductResponse());

        var response = productController.findAll();

        assertNotNull(response);
        assertEquals(HttpStatus.OK.value(), response.getStatusCode().value());
        assertEquals(ProductScenarioFactory.getListResponseEntityProductResponse().getBody().get(0).getId(), response.getBody().get(0).getId());
    }

    @Test
    void findById_WhenSendProductId_ExpectedSuccess(){
        when(productService.findProductById(anyString())).thenReturn(ProductScenarioFactory.getResponseEntityProductResponse());

        var response = productController.findById(ID);

        assertNotNull(response);
        assertEquals(HttpStatus.OK.value(), response.getStatusCode().value());
        assertEquals(ProductScenarioFactory.getResponseEntityProductResponse().getBody().getId(), response.getBody().getId());
    }

    @Test
    void findByFilters_WhenSendFiltersOfProduct_ExpectedSuccess() {
        when(productService.findProductByFilters(any(), any(), any())).thenReturn(ProductScenarioFactory.getListResponseEntityProductResponse());

        var response = productController.findByFilters((double) 0, (double) 300, "");

        assertNotNull(response);
        assertEquals(HttpStatus.OK.value(), response.getStatusCode().value());
        assertEquals(ProductScenarioFactory.getListResponseEntityProductResponse().getBody().get(0).getId(), response.getBody().get(0).getId());
    }

    @Test
    void createProduct_WhenSendProductRequest_ExpectedSuccess(){
        when(productService.createProduct(any())).thenReturn(ProductScenarioFactory.getResponseEntityProductResponse());

        var response = productController.createProduct(ProductScenarioFactory.getResponseEntityProductRequest().getBody());

        assertNotNull(response);
        assertEquals(HttpStatus.OK.value(), response.getStatusCode().value());
        assertEquals(ProductScenarioFactory.getResponseEntityProductResponse().getBody().getId(), response.getBody().getId());
    }

    @Test
    void updateProductById_WhenSendProductIdAndProductRequest_ExpectedSuccess() {
        when(productService.updateProductById(anyString(), any())).thenReturn(ProductScenarioFactory.getResponseEntityProductResponse());

        var response = productController.updateProductById(ID, ProductScenarioFactory.getResponseEntityProductRequest().getBody());

        assertNotNull(response);
        assertEquals(HttpStatus.OK.value(), response.getStatusCode().value());
        assertEquals(ProductScenarioFactory.getResponseEntityProductResponse().getBody().getId(), response.getBody().getId());
    }

    @Test
    void deleteProduct_WhenSendProductId_ExpectedSuccess()  {
        when(productService.deleteProduct(anyString())).thenReturn(ProductScenarioFactory.getResponseEntityProductResponse());

        var response = productController.deleteProduct(ID);

        assertNotNull(response);
        assertEquals(HttpStatus.OK.value(), response.getStatusCode().value());
        assertEquals(ProductScenarioFactory.getResponseEntityProductResponse().getBody().getId(), response.getBody().getId());
    }
}