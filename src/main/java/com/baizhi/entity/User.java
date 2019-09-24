package com.baizhi.entity;

public class User {
    private String id;
    private String username;
    private String password;
    private Integer age;
    private Department department;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", department=" + department +
                '}';
    }

    public User(String id, String username, String password, Integer age, Department department) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.department = department;
    }

    public User() {
    }
}
