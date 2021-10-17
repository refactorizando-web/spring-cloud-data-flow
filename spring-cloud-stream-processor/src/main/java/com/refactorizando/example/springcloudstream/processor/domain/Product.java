package com.refactorizando.example.springcloudstream.processor.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private Long id;

    private String name;

    private double price;
}
