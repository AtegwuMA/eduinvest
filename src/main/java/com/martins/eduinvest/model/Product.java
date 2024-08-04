package com.martins.eduinvest.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private LocalDate expirationDate;
    private Double amount;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;

    // Additional fields if necessary...
}
