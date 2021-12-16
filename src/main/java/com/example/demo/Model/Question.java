package com.example.demo.Model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Question")
public class Question {

    public Question() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;


    private String true_answer;
    private String wrong_answer1;
    private String wrong_answer2;
    private String wrong_answer3;


    public Question(long id, String true_answer, String wrong_answer1, String wrong_answer2, String wrong_answer3) {
        this.id = id;
        this.true_answer = true_answer;
        this.wrong_answer1 = wrong_answer1;
        this.wrong_answer2 = wrong_answer2;
        this.wrong_answer3 = wrong_answer3;
    }

    public String getWrong_answer1() {
        return wrong_answer1;
    }

    public void setWrong_answer1(String wrong_answer1) {
        this.wrong_answer1 = wrong_answer1;
    }

    public String getWrong_answer2() {
        return wrong_answer2;
    }

    public void setWrong_answer2(String wrong_answer2) {
        this.wrong_answer2 = wrong_answer2;
    }

    public String getWrong_answer3() {
        return wrong_answer3;
    }

    public void setWrong_answer3(String wrong_answer3) {
        this.wrong_answer3 = wrong_answer3;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    public String getTrue_answer() {
        return true_answer;
    }

    public void setTrue_answer(String true_answer) {
        this.true_answer = true_answer;
    }
}
