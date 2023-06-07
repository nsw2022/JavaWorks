package objects;

public class Book {
	// 필드
	int bookNumber;
	String BookTitle;
	
	// 생성자
	public Book(int bookNumber, String bookTitle) {
		
		this.bookNumber = bookNumber; 
		this.BookTitle = bookTitle;
	}
	
	/*
	public void showInfo() {
		System.out.println(bookNumber+", "+BookTitle);
	}
	*/
	
//	@Override
//	public String toString() {
//		
//		return bookNumber+", " + BookTitle;
//	}
	
	
	
	@Override
	public int hashCode() {
		
		return super.hashCode(); // 해시코드 반환값과 같은 의미
	}

	// equals재정의
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Book) {
			Book book = (Book) obj;
			if (this.bookNumber == book.bookNumber) {
				return true;
			}
		}
		return false;
	}
	
	
}
