package abstractex.phone;

public class PohneTest {

	public static void main(String[] args) {
		// 추상 클래스는 상속으로 밖에 생성 안됨
		
		// 스마트 폰 객체 생성
		SmartPhone sp = new SmartPhone("갤럭시 S20+ 오우너 노승우");
		sp.powerOn();
		sp.internetSearch();
		sp.pwoerOff();
	}

}
