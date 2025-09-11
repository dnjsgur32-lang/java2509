package kr.co.overload;

public class Calcu {
	
//	계산기 메인 역할
	public Calcu() {
		
		Calculator calc1 = new Calculator();
		Calculator calc2 = new Calculator();
		
		
//		리턴값이 없는 메소드 수행
//		calc1.add(5, 3);
		
//		리턴값이 있는 메소드 수행
//		int result2 = calc2.add(7, 8);
		
//		메소드 오버로딩
		int result1 = calc1.add(5, 3);
		double result2 = calc2.add(2.2, 3.3);
		int result3 = calc2.add(5, 3, 2);
		
//		calc1.cnt = 100;
//		Calculator.cnt = 99;
		
		int resultCnt;
		resultCnt = Calculator.getCnt();
		System.out.println("resultCnt: " + Calculator.getCnt());
		
		System.out.println("연산후 : resultCnt: " + Calculator.getCnt());
		
		Calculator.initCnt();
		System.out.println("resultCnt 초기화: " + Calculator.getCnt());
		
		
		
		//		Calculator.total = 1000;
		
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
	}
	
}
