package com.example.mvcdemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    
    private String firstName;
    private String lastName;

    // Address -> street + zipcode
    private Address address;
}
