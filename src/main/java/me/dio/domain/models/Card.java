package me.dio.domain.models;

import jakarta.persistence.*;

@Entity (name = "tb_card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    @Column(name = "available_limit", precision = 2, scale = 13)
    private Number limit;
}