package shelf;

public class BoookShelfTest {
	public static void main(String[] args) {
		//BookSelf 객체 생성
		BookSelf bookSelf = new BookSelf();
		
		bookSelf.enQueue("반응형 웹");// 책한권 넣음 FIFO
		bookSelf.enQueue("혼공 Java");//책한권 넣음 FIFO
		
		System.out.println(bookSelf.getSize()+"권");
		
		// 자료 출력(맨앞에 0번인덱스를 제거하고 출력)
		System.out.println(bookSelf.deQueue());
		System.out.println(bookSelf.deQueue());
	}
}
