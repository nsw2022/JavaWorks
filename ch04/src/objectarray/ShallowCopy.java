package objectarray;

public class ShallowCopy {
	public static void main(String[] args) {
		// 객체 배열의 복사
		Book[] array1 = new Book[3];
		Book[] array2 = new Book[3];
		
		array1[0] = new Book("반응형 웹사이트", "김은아");
		array1[1] = new Book("Tiny Python Project", "켄 유엔스-클락");
		array1[2] = new Book("혼자 공부하는 자바","신용권");
		
		// array1을 array2에 복사 // 얕은복사
		array2=array1;
		
		// 첫번재 책 수정(변경)
		array2[0].setBookName("나는 변경되었따!!");
		array2[0].setAuthor("작가도 변경되었따!");
		
		// array1 출력
		for (int i = 0; i < array1.length; i++) {
			array1[i].bookInfo();
		}
		System.out.println("===============================");
		// array2 출력
		for (int i = 0; i < array2.length; i++) {
			array2[i].bookInfo();
		}
		
		
		
		
 	}
}
