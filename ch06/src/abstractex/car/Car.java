package abstractex.car;

public abstract class Car {
	// 추상메소드
	public abstract void run();
	public abstract void refuel();
	
	public void stop() {
		System.out.println("차가 멈춥니다.");
	}
	
	
}
