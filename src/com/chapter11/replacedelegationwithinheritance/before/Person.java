package com.chapter11.replacedelegationwithinheritance.before;

//위임을 상속으로 전환
public class Person {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return name.substring(name.lastIndexOf(' ') + 1);
	}
}
