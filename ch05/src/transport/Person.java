package transport;

public class Person {

	String name;
	int age;
	int money;

	Person(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	
	// 요금을 내고 교통수단을 이용하는 매서드
	// Vehicle vehicle 상속과 다형성 이용
	public void take(Vehicle vehicle, int fee) {
		vehicle.carry(fee);
		this.money -= fee; // 가진 요금만큼 차감
	}
	
	public void showInfo() {
		System.out.printf("%s님의 남은 돈은 %,d원 입니다.\n",
				name,money);
	}

}
