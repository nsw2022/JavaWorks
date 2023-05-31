package tire;

public class CarMain2 {

	public static void main(String[] args) {
		
		Car2 mycar = new Car2();
		mycar.run();
		
		System.out.println("==================");
		
		// 앞바퀴 교체
		mycar.tires[0]=new KumTire();
		mycar.tires[1]=new KumTire();
		// 뒷바퀴 교체
		mycar.tires[2]=new HanTire();
		mycar.tires[3]=new HanTire();
		mycar.run();
		
		
	}

}
