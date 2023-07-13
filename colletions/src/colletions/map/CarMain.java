package colletions.map;

public class CarMain {
	public static void main(String[] args) {
		// CarFactory 생성
		CarFactory factory = CarFactory.getInstance();
		
		// 자동차 생성
		Car ioic1 = factory.createCar("전기차");
		Car ioic2 = factory.createCar("전기차");
		
		System.out.println(ioic1);
		System.out.println(ioic2);
		System.out.println(ioic1==ioic2);
		
		Car suso1 = factory.createCar("수소차");
		Car suso2 = factory.createCar("수소차");
		System.out.println(suso1==suso2);
		System.out.println(ioic1==suso1);
		
	}
}
