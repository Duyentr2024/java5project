package com.example.java5.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private Long quantity;
    @Column(name = "productName", columnDefinition = "NVARCHAR(255)")
    private String productName;
    @Column(name = "productDescription", columnDefinition = "NVARCHAR(255)")
    private String productDescription;
    private Double productPrice;
    private String productImage;
    private String productStatus;
}
