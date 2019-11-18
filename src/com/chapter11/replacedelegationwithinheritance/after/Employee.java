package com.chapter11.replacedelegationwithinheritance.after;

//위임을 상속으로 전환
public class Employee extends Person{

	public String toString() {
		return "사원" + getLastName();
	}
}
