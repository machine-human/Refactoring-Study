package com.chapter11.extractsubclass.before;

//하위클래스 추출
public class Execute {
	public static void main(String[] args) {
		Employee kent = new Employee(5);
		JobItem jobItem = new JobItem(0, 5, true, kent);
	}
}
