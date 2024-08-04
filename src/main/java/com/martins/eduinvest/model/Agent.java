package com.martins.eduinvest.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
public class Agent extends Person {
    private String location; // Location details

    @OneToMany(mappedBy = "agent")
    private List<Transaction> transactions;

    private String referralCode;

    @OneToMany(mappedBy = "agent")
    private List<Customer> referrals; // Referrals linked to this agent

    // Additional fields...
    private boolean emailVerified; // Email verification status
    private Integer totalReferrals;
    private Double referralBonus;
    private String bankDetails; // Could be a JSON or structured object

}
