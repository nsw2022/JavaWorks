package statics;

public class CardTest {

	public static void main(String[] args) {
		// 카드번호 101, 102, 103 생성
		Card c1 = new Card();
		Card c2 = new Card();
		Card c3 = new Card();
		

		System.out.println("카드번호: "+c1.getCardNum());
		System.out.println("카드번호: "+c2.getCardNum());
		System.out.println("카드번호: "+c3.getCardNum());

		System.out.println(c1); // 인스턴스 card1의 주소
		System.out.println(c2);
		System.out.println(c3);
		

	}

}
