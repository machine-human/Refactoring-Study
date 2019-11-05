package com.cahpter07.removemiddleman.before;

//과잉 중개 메서드 제거
public class Person {
    Department department;

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Person getManager() {
        return department.getManager();
    }
}