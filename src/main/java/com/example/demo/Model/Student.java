package com.example.demo.Model;



import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="Student")
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name="username",unique = true)
    private String username;

    private String password;
    private String name;

    public Student() {
    }

    @OneToMany(cascade = { CascadeType.MERGE })
    @JoinTable(
            name = "Exam_Student",
            joinColumns = { @JoinColumn(name = "student_id") },
            inverseJoinColumns = { @JoinColumn(name = "result_id") }
    )
    private Set<Result> results ;


    public Student(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(username, student.username) && Objects.equals(password, student.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password);
    }
}
