package abstractex.animal;

public abstract class Animal {
	
	public String kind; // 동물의 종
	
	public void breathe() {
		System.out.println("동물이 숨을 쉽니다.");
	}
	
	// 선언부만 있고 구현이 없다 - 추상메소드
	// 상속 받는 클래스에 받드시 구현해야 함
	public abstract void sound(); 
	
	public void showInfo() {
		System.out.println("동물의 종류는 " + kind+"입니다.");
	}
	
}
