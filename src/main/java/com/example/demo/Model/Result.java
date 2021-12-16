package com.example.demo.Model;

import javax.persistence.*;


@Entity
@Table(name="Result")
public class Result {

    public Result() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    private float result;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }
}
