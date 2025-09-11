
public class Book {
//	필드 : 책의 속성
	String title;
	String author;
	int year;
	
// 생성자 : 객체를 생성하면 초기값을 세팅함.

	public Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
//	메소드 : 책의 동작/기능
	
	public void printInfo() {
		System.out.println(year + "년에 출판된 " + author + "의 '" + title + "'");
	}
	

}
