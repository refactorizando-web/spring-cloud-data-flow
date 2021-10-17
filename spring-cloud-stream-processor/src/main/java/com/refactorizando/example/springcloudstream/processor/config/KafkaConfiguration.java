package com.refactorizando.example.springcloudstream.processor.config;

import com.refactorizando.example.springcloudstream.processor.domain.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

@Configuration
@Slf4j
public class KafkaConfiguration {

    @Bean
    public Function<Flux<Product>, Flux<Product>> productProcessor(){
        return product -> product
                .map(i -> evaluateProduct(i))
                .log();
    }

    private Product evaluateProduct(Product product) {

        if (product.getPrice() > 5) {
            product.setPrice(product.getPrice()*0.10);
        }

        return product;
    }

}
