package abstractex.car;

public class Truck extends Car{

	@Override
	public void run() {
		System.out.println("트럭이 달립니다~");	
		
	}

	@Override
	public void refuel() {
		System.out.println("휘발류 충전스~");	
		
	}
	
	public void load() {
		System.out.println("짐을 싣습니다~");
	}

}
