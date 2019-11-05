package com.cahpter07.hidedelegate.after;

//대리 객체 은폐
public class Person {
    Department department;

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Person getManager() {
        return department.getManager();
    }
}
