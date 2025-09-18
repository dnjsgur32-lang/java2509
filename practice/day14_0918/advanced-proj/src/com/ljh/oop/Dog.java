package com.ljh.oop;

public class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}

	@Override
	String speak() {
		return "멍멍!";
	}

	public void wagtail() {
		System.out.println(name + "가 꼬리를 흔든다.");
	}
	
}
