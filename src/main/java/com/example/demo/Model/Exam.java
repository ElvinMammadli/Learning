package com.example.demo.Model;

import javax.persistence.*;

@Entity
@Table(name="Exam")
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
}
