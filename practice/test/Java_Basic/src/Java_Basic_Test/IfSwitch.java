package Java_Basic_Test;

public class IfSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;
		
		if (score >= 90) {
			System.out.println("학점: A");
		} else if (score >= 80) {
			System.out.println("학점: B");
		} else if (score >= 70) {
			System.out.println("학점: C");
		} else {
			System.out.println("학점: F");
		}
		
		int grade = score / 10;
		switch (grade) {
			case 10:
			case 9:
				System.out.println("학점: A");
				break;
			case 8:
				System.out.println("학점: B");
				break;
			case 7:
				System.out.println("학점: C");
				break;
			default:
				System.out.println("학점: F");
		}
	}

}
