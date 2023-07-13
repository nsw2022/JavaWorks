package colletions.map;

import java.util.HashMap;

public class CarFactory {
	private static CarFactory instance; // 객체 필드
	private HashMap<String, Car> carMap = new HashMap<>();
	
	private CarFactory() {}
	
	// 회사인스턴스 생성됨
	public static CarFactory getInstance() {
		if (instance == null) instance = new CarFactory(); return instance;
	}
	
	// 자동차 회사가 자동차를 만드는 메서드
	public Car createCar(String type) {
		if (carMap.containsKey(type)) return carMap.get(type);
		
		Car car = new Car();
		carMap.put(type, car); // type과 car객체 넣기
		return car;
	}
}
