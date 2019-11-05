package com.cahpter07.removemiddleman.after;

//과잉 중개 메서드 제거
public class Person {
    Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}