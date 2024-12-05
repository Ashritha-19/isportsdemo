package com.neoteric.isports.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "phoneNumber",nullable = false)
    private String phoneNumber;
}
