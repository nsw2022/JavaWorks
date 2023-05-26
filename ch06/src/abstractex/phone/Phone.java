package abstractex.phone;

// 추상클래스(상속받는 클래스에게 필드, 매서드의 이름을 통일적으로 사용하도록 함
public abstract class Phone {
	public String onwer;// 주인
	
	// 생성자
	public Phone(String onwer) {
		this.onwer=onwer;
	}
	
	// 매서드
	public void powerOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void pwoerOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
