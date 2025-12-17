package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;

@Entity
public class StudentEntity{

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

private Long id;
private String name;
private String email;
private float cgpa;

public void setName(String name){
    this.name=name;
}
public String getName(){
    return this.name;
}
public void setEmail(String email){
    this.email=email;
}
public String getEmail(){
    return this.email;
}
public void setCgpa(float cgpa){
    this.cgpa=cgpa;
}
public float getCgpa(){
    return this.cgpa;
}
public StudentEntity(Long id,String name,String email,float cgpa){
    this.name=name;
    this.id=id;
    this.email=email;
    this.cgpa=cgpa;
    this.id=id;
}
public StudentEntity(){
}
}