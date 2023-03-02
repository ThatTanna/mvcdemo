package com.example.mvcdemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
public class Address {
    
    private String street;
    private Integer zipcode;
}
