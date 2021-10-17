package com.refactorizando.example.springcloudstream.source;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private Long id;

    private String name;

    private double price;
}
