package tire;

public class Car2 {
	// 필드 - 객체 배열
	Tire[] tires= {
			new HanTire(), //0
			new HanTire(), //1
			new KumTire(),
			new KumTire()
	};
	
	// 메서드
	public void run() {
		for (Tire tire : tires) tire.roll();
		
	}
	
}
