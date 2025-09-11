package kr.co.overload;

public class Calculator {
	
//	int cnt;	
	static int cnt = 0;
	
	public static int getCnt() {
		return cnt;
	}
	
	public static void initCnt() {
		cnt = 0;
	}

	
//	반드시, 클래스를 통해서 접근해야한다.
//	static int total;
	
	
//	    타입 : 정수  결과 : 5  +    3
	public int add(int num1, int num2) {
		++cnt;
		return num1 + num2;		
	}

//    타입 :  실수     결과 :     2.2     *    3.3
	public double add(double num1, double num2) {
		++cnt;
		return num1 * num2;
	}
//    타입 : 정수  결과 :    5     +   3     +   2
	public int add(int num1, int num2, int num3) {
		++cnt;
		return num1 + num2 + num3;
	}







	
	
}
	
	
