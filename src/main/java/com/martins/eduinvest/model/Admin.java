package com.martins.eduinvest.model;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Data
public class Admin extends Person {

    @Column(unique = true)
    private String superAdminEmail; // For identification

    @OneToMany(mappedBy = "admin")
    private List<Agent> agents;

    @OneToMany(mappedBy = "admin")
    private List<Product> products;

    // Other admin specific properties...
}