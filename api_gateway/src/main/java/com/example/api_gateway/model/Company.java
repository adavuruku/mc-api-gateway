package com.example.api_gateway.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Company {
    private Integer id;
    private String name;

    private String type;
}
