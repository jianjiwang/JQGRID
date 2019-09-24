package com.baizhi.entity;

public class Department {
    private Integer id;
    private String departmentname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentname='" + departmentname + '\'' +
                '}';
    }

    public Department(Integer id, String departmentname) {
        this.id = id;
        this.departmentname = departmentname;
    }

    public Department() {
    }
}
