package inheritance.airplane;

public class AirPlanMain {

	public static void main(String[] args) {
		// SuperSonicAirPlane 생성
		SuperSonicAirPlane sa = new SuperSonicAirPlane();
		
		sa.takeOff();
		sa.fly();
		sa.land();
		System.out.println();
		
		sa.takeOff();
		//초음속비행
		sa.flymode=SuperSonicAirPlane.SUPERSONIC;
		sa.fly();
		//비행모드
		sa.flymode=SuperSonicAirPlane.NOMAL;
		sa.fly();
		
		sa.land();

	}

}
