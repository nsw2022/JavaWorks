package inheritance.car;

import java.util.ArrayList;

public class CarArrayList {

	public static void main(String[] args) {
		ArrayList<Car> cars = new ArrayList<>();
		// 자동차를 3대 생성 - ArrayList에 넣어보기
		cars.add(new Car("아우디", 10_000));
		cars.add(new Car("폭스바겐", 20_000));
		cars.add(new Car("벤틀리", 30_000));
		
		// 특정요소 1개 검색
		System.out.println( cars.get(1).carInfo() );
		System.out.println();
		
		// 전체 요소 출력
		for (Car i : cars) System.out.println( i.carInfo() ); 

	}

}
