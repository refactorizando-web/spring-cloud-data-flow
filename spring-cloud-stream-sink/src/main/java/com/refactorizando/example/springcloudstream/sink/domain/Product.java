package com.refactorizando.example.springcloudstream.sink.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {

    private Long id;

    private String name;

    private double price;
}
