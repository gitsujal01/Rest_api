package com.mycompany.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class User {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
  private String name;
  private String city;
  private Integer age;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
  
}
