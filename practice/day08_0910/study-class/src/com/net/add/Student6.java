package com.net.add;

public class Student6 {
	
	String stId;
	String name;
	int age = 20;
	
//	생성자 : 오브젝트의 초기값을 담당.
	public Student6() {
//		System.out.println("학생이 생성 되었습니다.");
	}
// this는 메인 클래스에 있는 변수
	public Student6(String name) {
		this.name = name;
	}

	public Student6(String stId, String name) {
		this.stId = stId;
		this.name = name;
	}

	public Student6(String stId, String name, int age) {
		this.stId = stId;
		this.name = name;
		this.age = age;
	}
	
// method 함수: 액션_행동 구현부.
	public void introduce() {
		System.out.println(this.name + " 학생이 자기 소개를 합니다.");
	}
	
	public void study() {
		System.out.println(this.name + " 학생이 공부를 합니다.");
	}
	
	
}
