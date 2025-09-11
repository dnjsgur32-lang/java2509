package com.net.add;

public class AddStudent {

	public AddStudent() {
		/*
		 * // ex1_객체 생성 Student st1 = new Student();
		 * 
		 * System.out.println(st1);
		 */
		
		/*
		 * // ex2_객체 생성 및 속성 정의와 사용. (클래스 안에 변수 넣어주는것이 정의)
		 * 
		 * Student2 st2 = new Student2(); st2.name = "이정현"; st2.age = 30; st2.StudentId
		 * = "20250730";
		 * 
		 * System.out.println(st2.name); System.out.println(st2.age);
		 * System.out.println(st2.StudentId);
		 */
		
		/*
		 * // ex3_객체 생성, 메소드 정의와 사용. Student3 st3 = new Student3(); st3.introduce();
		 * st3.study();
		 */
		
		/*
		 * // ----ex4_생성자 constructors
		 * 
		 * // 선언부 >> int, num 하고 같다. Student4 st4;
		 * 
		 * // 구현부 >> num = 10 변수에 값을 주는곳. st4 = new Student4();
		 */
		
		/*
		 * // ex5_객체 생성자(argument)를 전달 및 사용법
		 * 
		 * Student5 st5;
		 * 
		 * // 기본 생성자 st5 = new Student5();
		 * 
		 * // 매개변수 1개 생성자 Student5 st5_a = new Student5("정현1"); // 매개변수 2개 생성자 Student5
		 * st5_b = new Student5("정현5", 29); // 매개변수 3개 생성자 Student5 st5_c = new
		 * Student5("정현8 /", 22, "20250722");
		 */
		
//		ex6_종합_객체생성, 필드생성, 생성자에서 필드 초기화, 메소드 생성
		Student6 st6;
//		기본 생성자
		st6 = new Student6();
//		매개변수 1개
		Student6 st6_a = new Student6("주환");
//		매개변수 2개_'필수' 필드 입력
		Student6 st6_b = new Student6("20250808", "근철");
//		매개변수 3개_'전체 필드' 입력
		Student6 st6_c = new Student6("20240910", "지민", 22);
		
		
		/*
		 * System.out.println(st6_a.name); System.out.println("----------------");
		 * System.out.println(st6_b.stId); System.out.println(st6_b.name);
		 * System.out.println(st6_b.age); System.out.println("----------------");
		 * System.out.println(st6_c.stId); System.out.println(st6_c.name);
		 * System.out.println(st6_c.age);
		 */
		
		st6_a.introduce();
		st6_b.study();
		st6_c.study();
	}
}
