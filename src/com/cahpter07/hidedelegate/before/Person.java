package com.cahpter07.hidedelegate.before;

//대리 객체 은폐
public class Person {
    Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}

