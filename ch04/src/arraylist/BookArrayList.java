package arraylist;

import java.util.ArrayList;

import objectarray.Book;

public class BookArrayList {

	public static void main(String[] args) {
		// 책을 저장할 ArrayList의 공간 생성
		ArrayList<Book> bookList = new ArrayList<>();
		
		// 책 객체 생성해서
		Book b1 = new Book("반응형 웹사이트", "김은아");
		Book b2 = new Book("Tiny Python Project", "켄 유엔스-클락");
		Book b3 = new Book("혼자 공부하는 자바","신용권");
		
		
		// bookList에 저장
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		
		
		//book의 정보 출력
		b1.bookInfo();
		b2.bookInfo();
		b3.bookInfo();
		
		//book1의 정보(인덱싱) - 1개 가져오기
		System.out.println(bookList.get(0));//객체의 메모리 주소
		bookList.get(0).bookInfo();// 객체의 정보
		
		
		// bookList의 크기
		System.out.println(bookList.size()+"개");
		
		//전체 요소 출력
		for (int i = 0; i < bookList.size(); i++) {
			Book book = bookList.get(i);
			book.bookInfo();
		}
		
		// book2삭제
		if (bookList.contains(b3)) bookList.remove(b3);
		
		System.out.println("=================================");
		// 향상 for문
		for (Book book : bookList) book.bookInfo();
		
		
	}

}
