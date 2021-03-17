package com.christian.productos.entity;

import lombok.Data;

import javax.persistence.Id;

@Data
public class Product {
    @Id
    private Long id;
    private String title;
    private String image;
    private Double price;
    private String description;
}
