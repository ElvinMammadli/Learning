package com.example.demo.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Class")
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    private String name;
    private String explanation;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Class_Student",
            joinColumns = { @JoinColumn(name = "class_id") },
            inverseJoinColumns = { @JoinColumn(name = "student_id") }
    )
    private Student students;

    @OneToOne(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Class_Teacher",
            joinColumns = { @JoinColumn(name = "class_id") },
            inverseJoinColumns = { @JoinColumn(name = "teacher_id") }
    )
    private Teacher teacher;

    @OneToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Class_Exam",
            joinColumns = { @JoinColumn(name = "class_id") },
            inverseJoinColumns = { @JoinColumn(name = "exam_id") }
    )
    private Exam exams;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public Student getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Exam getExams() {
        return exams;
    }

    public void setExams(Exam exams) {
        this.exams = exams;
    }
}