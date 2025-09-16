package co.kr.game;

public class Mage extends Character {
	public Mage(String name, int hp, int attackPower, int defense) {
		super(name, hp, attackPower, defense);
	}

	@Override
	public boolean attack() {
		System.out.println(name + " (마법사)이(가) 화염구를 시전합니다!");
		boolean evaded = Math.random()>0.5;
		if (evaded) {
			System.out.println("상대가 공격을 피했다!");
			return false;
		}else {
			System.out.println("화염구가 명중했다!");
			return true;
		}
	}

}
