package classpart;

public class CircleTest {

	public static void main(String[] args) {
		// 원 객체 생성
		Circle c1 = new Circle(3, 4, 10);
		Circle c2 = new Circle(10, 15, 20);
		
//		System.out.printf("원의 중심은 (%2d, %2d)이고, 반지름은 %d입니다.\n",
//				c1.center.x,c1.center.y,c1.radius);
//		
//		System.out.printf("원의 중심은 (%d, %d)이고, 반지름은 %dcm입니다.\n",
//				c2.center.x,c2.center.y,c2.radius);
		
		c1.showInfo();
		c2.showInfo();
	}

}
