package com.ljh.oop;

public class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}

	@Override
	String speak() {
		return"야옹~";
	}
	
	void scratch() {
		System.out.println(name + "가 발톱을 세운다.");
	}
}
