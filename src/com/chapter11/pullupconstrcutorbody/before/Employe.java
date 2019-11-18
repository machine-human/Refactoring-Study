package com.chapter11.pullupconstrcutorbody.before;

//생성자 내용 상향
class Employee {
    protected String name;
    protected String id;
}

class Manager extends Employee {
    int grade;

    public Manager(String name, String id, int grade) {
        super.name = name;
        super.id = id;
        this.grade = grade;
    }
}