package colletions.product;

public class ProductTest {

	public static void main(String[] args) {
		// 자료형 < 클래스, 문자열 >
		Product<Tv, String> product1 = new Product<>();
		Tv tv = new Tv();
		product1.setKind(tv);;
		product1.setModel("스마트 Tv");
		
		tv.making();
		String tvModel = product1.getModel();
		System.out.println("모델: " + tvModel + "\n");
		
		// 자동차
		Product<Car, String> product2 = new Product<>();
		Car car = new Car();
		product2.setKind(car);
		product2.setModel("전기차");
		
		car.making();
		String carModel = product2.getModel();
		System.out.println("모델: " + carModel);
		
	}

}
