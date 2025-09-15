package kr.co.poly;

import java.util.Iterator;

import kr.co.ext.Animal;
import kr.co.ext.Cat;
import kr.co.ext.Dog;

public class PolyClass {

	public PolyClass() {
//		다형성 배열에서 업캐스팅은 자식 객체를 부모 타입 참조 변수에 담는 것을 말한다.
		Animal[] ani =
			{new Dog("바둑이", 5, "진돗개"),
				new Cat("나비", 3, false),
				new Dog("체리", 2, "푸들"),
				new Cat("까망이", 4, true)
				};
		System.out.println("다형성 배열로 생성된 객체의 속성 값에 접근하기.");
		for (Animal a : ani) {
//			다형성이란, 부모 타입으로 자식 객체를 참조할 때 각각 오버라이드된 메서드가 호출되는 특성을 말한다.
			System.out.println("**" + a.getName());
			a.makeSound();
		}
		
		System.out.println("-----자식 객체의 속성에 접근-----");
		for (Animal a : ani) {
			if (a instanceof Dog) {
//				임시변수 : 다운캐스팅 시 타입을 맞추어 자식 고유 메서드나 속성에 접근하기 위해 필요하다.
				Dog d = (Dog)a;
				d.wagTail();
			} else if (a instanceof Cat) {
				Cat c = (Cat)a;
				c.climb();
			}{

			}
		}
	}
}
