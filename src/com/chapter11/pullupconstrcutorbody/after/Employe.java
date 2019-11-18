package com.chapter11.pullupconstrcutorbody.after;

//생성자 내용 상향
class Employee {
    protected String name;
    protected String id;

    protected Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }
}

class Manager extends Employee {
    int grade;

    public Manager(String name, String id, int grade) {
        super(name, id);
        this.grade = grade;
    }
}