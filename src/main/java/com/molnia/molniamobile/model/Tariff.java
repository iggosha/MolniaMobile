package com.molnia.molniamobile.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "tariff")
public class Tariff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "cost")
    private String cost;
    @Column(name = "internet")
    private String internet;
    @Column(name = "calls")
    private String calls;
    @Column(name = "sms")
    private String sms;
    @Column(name = "description")
    private String description;
}
