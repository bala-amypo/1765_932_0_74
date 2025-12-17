package com.example.demo.entity;

import jakarta.persistence.Entity;

@Entity
public class StudentEnity{

private int id;
private String name;
private String email;
private float cgpa;
private String dept;


public void setId(int id){
    this.id=id;
}
public int getID(){
    return id;
}