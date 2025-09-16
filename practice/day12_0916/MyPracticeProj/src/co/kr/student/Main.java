package co.kr.student;

public class Main {

	public static void main(String[] args) {
		Student s1 = new MiddleStudent("철수", 14);
		Student s2 = new HighStudent("영희", 17);
		
		s1.displayInfo();
		s1.Study();
		
		s2.displayInfo();
		s2.Study();
		
		Studyable[] list = { s1, s2};
		for (Studyable st : list) {
			st.Study();
		}
	}

}
