package classpart;

public class Circle {
	Point center; // Point 클래스를 멤버변수로 사용 
	int radius;
	
	// 생성자public private이 없는 경우가 default
	// default는 다른 패키지에 사용못함
	
	public Circle(int x, int y, int radius) {
		center = new Point(x, y); // 중심점 생성
		this.radius=radius;
	}
	
	// 원의 정보 출력 메서드
	public void showInfo() {
		System.out.printf("원의 중심은 (%2d, %2d)이고, 반지름은 %d입니다.\n",
				this.center.x,this.center.y,this.radius);
	}
	
	
}
