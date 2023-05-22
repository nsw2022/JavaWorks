package statics;

public class Card {

	static int seriaNum = 100;
	int cardNum;	// 카드번호
	
	public Card() {
		seriaNum++;
		cardNum = seriaNum;
	}
	
	public int getSeriaNum() {
		return seriaNum;
	}
	
	public static void setSeriaNum(int seriaNum) {
		Card.seriaNum = seriaNum;
	}
	
	// 카드 번호를 가져오는 함수 생성
	public int getCardNum() {
		return cardNum;
	}
	
	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
	

	
}
