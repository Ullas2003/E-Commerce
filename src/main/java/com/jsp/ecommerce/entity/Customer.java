package com.jsp.ecommerce.entity;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
 @Id
 @GeneratedValue(strategy =GenerationType.IDENTITY)
 private Long id;
 @Column(nullable=false)
 private String name;
 @Column(unique=true,nullable=false)
 private String email;
 @Column(nullable=false)
 private String password;
 public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public LocalDateTime getCreatedTime() {
	return createdTime;
}
public void setCreatedTime(LocalDateTime createdTime) {
	this.createdTime = createdTime;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@CreationTimestamp
	private LocalDateTime createdTime;

}

