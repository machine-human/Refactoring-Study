package com.chapter11.extractsubclass.after;

//하위클래스 추출
public class Execute {
	public static void main(String[] args) {
		Employee kent = new Employee(5);
		JobItem j1 = new LaborItem(0, 5, true, kent);
		JobItem j2 = new JobItem(10, 15);
	}
}
