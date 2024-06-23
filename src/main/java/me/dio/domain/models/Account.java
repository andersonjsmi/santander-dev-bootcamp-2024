package me.dio.domain.models;

import jakarta.persistence.*;

@Entity(name = "tb_account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    private String agency;

    @Column(precision = 2, scale = 13)
    private Number balance;

    @Column(name = "additional_limit", precision = 2, scale = 13)
    private Number limit;
}
