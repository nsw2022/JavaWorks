package objectarray;

public class Bookmain {

	public static void main(String[] args) {
		// Book 객체 생성 - 책 5권 생성
		Book[] lib = new Book[5];

		// 배열의 초기값은 - null
		for (int i = 0; i < lib.length; i++) {
			System.out.println(lib[i]);
		}

		// 자료저장
		lib[0] = new Book("반응형 웹사이트", "김은아");
		lib[1] = new Book("Tiny Python Project", "켄 유엔스-클락");
		lib[2] = new Book("혼자 공부하는 자바","신용권");
		lib[3] = new Book("미생1","윤태호");
		lib[4] = new Book("미생2","윤태호");


		// 향상 for // if 조건 배열에 저장되있지 않은 공간있을때 반드시 명시
		for (Book book : lib) if (book != null) book.bookInfo();
			
	}

}
