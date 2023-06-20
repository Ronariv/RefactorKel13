package com.myapp;
import java.util.ArrayList;
import java.util.List;


public class Role {
 private String roleName;
 private List<UserRole> userRoles;

 public Role(String roleName) {
     this.roleName = roleName;
     userRoles = new ArrayList<>();
 }
 public List<UserRole> getUsers() {
     return userRoles;
 }

 public String getRoleName() {
     return roleName;
 }
}
