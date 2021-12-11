package com.example.demo.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Exam")
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    private String name;
    private Date date;


}
