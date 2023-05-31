package tire;

public class CarMain {

	public static void main(String[] args) {
		
		// Car 객체 생성
		Car mayCar = new Car();
		mayCar.run();
		
		System.out.println("=========================");
		
		// 앞바퀴 2개 교체
		mayCar.frontLeftTire = new KumTire();
		mayCar.frontRightTire = new KumTire();
		mayCar.backLeftTire = new HanTire();
		mayCar.backRightTire = new HanTire();
		mayCar.run();
	}

}
