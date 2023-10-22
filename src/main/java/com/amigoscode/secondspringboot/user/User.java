package com.amigoscode.secondspringboot.user;

import java.time.LocalDate;
import java.util.UUID;

public class User {

    private String name;
    private String surname;
    private int age;
    private LocalDate createdDate;
    private UUID id;

    public User() {
    }

    public User(String name, String surname, int age, LocalDate createdDate, UUID id) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.createdDate = createdDate;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", createdDate=" + createdDate +
                ", id=" + id +
                '}';
    }
}
