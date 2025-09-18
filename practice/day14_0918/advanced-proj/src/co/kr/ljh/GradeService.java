package co.kr.ljh;

public class GradeService {
	public static void run(java.util.List<Student> list) {
		list.sort(java.util.Comparator
				.comparingDouble(Student::avg)
				.reversed()
				.thenComparing(Student::name)
		);
		
		System.out.println("=== 성적 리포트 ===");
		for (Student s : list) {
			String line = ("- %s | avg=%.2f | %s")
					.formatted(s.name(), s.avg(), s.view());
			System.out.println(line);
		}
		
		java.util.Set<String> subs =
				new java.util.LinkedHashSet<>();
		for(Student s : list) {
			subs.addAll(s.view().keySet());
		}
		System.out.println("과목: " + subs);
	}
}
