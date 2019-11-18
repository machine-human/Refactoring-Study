package com.chapter11.replacedelegationwithinheritance.before;

//위임을 상속으로 전환
public class Employee {
	Person person = new Person();

	public String getName() {
		return person.getName();
	}

	public void setName(String arg) {
		this.person.setName(arg);
	}

	public String toString() {
		return "사원" + person.getLastName();
	}
}
