package kr.co.interf;

import kr.co.ext.Bird;
import kr.co.ext.Duck;

public class InterFClass {
	
	public InterFClass() {
		
//		이름, 나이, 날개폭
		Bird bird = new Bird("참새", 1, 25.5);
		
		Duck duck = new Duck("도넏드", 3);
		
		bird.makeSound();
		bird.fly();
		bird.walk();
		System.out.println("==============");
		duck.makeSound();
		duck.walk();
		duck.swimm();
		System.out.println("==============");
		
//		인터페이스 타입 사용해보기.
		Walkable[] walkAni = {bird, duck};
		for (Walkable w : walkAni) {
			w.walk();
		}
		
//		다양한 인터페이스
		testSwimm(duck);	
	}

	
	public static void testSwimm(Swimmable swimmer) {
		swimmer.swimm();
	}
}







