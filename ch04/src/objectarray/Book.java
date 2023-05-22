package objectarray;

public class Book {
	// 책 이름을 가져오는 메서드
	public String getBookName() {
		return bookName;
	}

	// 책 이름을 설정하는 메서드
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	// 작가 이름을 가져오는 메서드
	public String getAuthor() {
		return author;
	}
	
	// 작가 이름을 설정하는 메서드
	public void setAuthor(String author) {
		this.author = author;
	}

	String bookName;
	String author;
	
	public Book() {	} // 기본생성자
	
	
	// 생성자
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	public void bookInfo() {
		System.out.println(bookName + ", " + author);
	}
	
	
}
