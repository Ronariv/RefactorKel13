package com.myapp;
import java.util.ArrayList;
import java.util.List;


public class User {
 private String name;
 private List<UserRole> userRoles;

 public User(String name) {
     this.name = name;
     userRoles = new ArrayList<>();
 }

 public List<UserRole> getRoles() {
     return userRoles;
 }

 public String getName() {
     return name;
 }
}
