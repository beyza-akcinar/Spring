package com.example.demo.student;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(name="s", sequenceName = "s", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s")
    private long id;
    private String name;
    private String surname;
    private LocalDate date;
    private Integer age;

    public Student(String name, String surname, LocalDate date, Integer age) {
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.age = age;
    }

    public Student(long id, String name, String surname, LocalDate date, Integer age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.age = age;
    }

    public Student() {

    }

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", date=" + date +
                ", age=" + age +
                '}';
    }
}
