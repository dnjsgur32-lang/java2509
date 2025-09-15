package reference.type;

import java.util.Iterator;

public class Do_an_exercise {
	public static void main(String[] args) {
		int[][]array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		System.out.println(array.length);
		System.out.println(array[2].length);
		System.out.println("================");
		
		int[]array1 = {1, 5, 3, 8, 2};
		
		int max = array1[0];
		
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] > max) {
				max = array1[i];
			}
		}
		
		System.out.println("최대값: " + max);
		System.out.println("================");

		int[][]array2 = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		int count = 0;
		
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				sum += array2[i][j];
				count++;
			}
		}
		
		double avg = (double) sum / count;
		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
	}
}
