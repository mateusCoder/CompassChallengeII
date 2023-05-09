package com.compass.msproductmanagement.scenarioFactory;

import com.compass.msproductmanagement.domain.dto.ProductRequest;
import com.compass.msproductmanagement.domain.dto.ProductResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class ProductScenarioFactory {

    private static final String ID = "1";
    private static final String NAME = "Notebook";
    private static final String DESCRIPTION = "Notebook Gamer Ultima Geração";
    private static final Double PRICE = 400.00;

    public static ResponseEntity<ProductResponse> getResponseEntityProductResponse(){
        return ResponseEntity.ok().body(ProductResponse.builder()
                .id(ID)
                .name(NAME)
                .description(DESCRIPTION)
                .price(PRICE)
                .build());
    }

    public static ResponseEntity<List<ProductResponse>> getListResponseEntityProductResponse(){
        return ResponseEntity.ok().body(List.of(getResponseEntityProductResponse().getBody()));
    }

    public static ResponseEntity<ProductRequest> getResponseEntityProductRequest(){
        return ResponseEntity.ok().body(ProductRequest.builder()
                .name(NAME)
                .description(DESCRIPTION)
                .price(PRICE)
                .build());
    }

}
