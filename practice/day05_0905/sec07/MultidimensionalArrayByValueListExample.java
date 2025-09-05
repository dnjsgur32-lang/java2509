package ch05.sec07;

public class MultidimensionalArrayByValueListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2차원 배열 생성
		int[][] scores = {
				{80, 90, 96},
				{ 76, 88}
		};
		
		//배열의 길이
		System.out.println("1차원 배열 길이(반의 수): " + scores.length);
		System.out.println("2차원 배열 길이(첫 번째 반의 학생 수): " + scores[0].length);
		System.out.println("2차원 배열 길이(두 번째 반의 학생 수): " + scores[1].length);
		
		
	}

}
