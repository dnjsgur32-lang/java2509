package kr.co.ext;

import kr.co.interf.Swimmable;
import kr.co.interf.Walkable;

public class Duck extends Animal implements Swimmable, Walkable {

	public Duck(String name, int age) {

	}

	@Override
	public void walk() {
		System.out.println("뒤뚱뒤뚱 걸어요.");
	}

	@Override
	public void swimm() {
		System.out.println("풍덩 수영해요.");
	}

	@Override
	public void makeSound() {
		super.makeSound();
		System.out.println("꽥꽥");
	}

	

}
