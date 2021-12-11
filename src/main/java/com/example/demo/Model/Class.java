package com.example.demo.Model;

import javax.persistence.*;

@Entity
@Table(name="Class")
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
}