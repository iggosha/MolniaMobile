package com.molnia.molniamobile.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@Table(name = "news")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "publication_date")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/mm/yyyy")
    private Date publication_date;

    @Column(name = "description")
    private String description;
}
