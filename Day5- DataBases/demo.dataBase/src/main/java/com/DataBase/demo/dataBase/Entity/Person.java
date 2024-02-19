package com.DataBase.demo.dataBase.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name="person")
public class Person {
    @Id
    @GeneratedValue
    private  int Id;
    private String Name;

    private String location;
    private String birthDate;

    public Person( String name, String location, String birthDate) {
        Name = name;
        this.location = location;
        this.birthDate = birthDate;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", location='" + location + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
