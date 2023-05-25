package downcasting;

import java.util.ArrayList;

class Animal {
	public void breathe() {
		System.out.println("동물이 숨을 쉽니다.");
	}
}

class Human extends Animal {
	@Override
	public void breathe() {
		System.out.println("사람이 숨을 쉽니다");
	}

	public void read() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		System.out.println("호랑이가 숨을 쉽니다.");
	}

	public void hunt() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		System.out.println("독수리가 숨을 쉽니다");
	}

	public void fly() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}

public class AnimalTest {

	static ArrayList<Animal> anmalList = new ArrayList<>();

	public static void main(String[] args) {

		anmalList.add(new Human()); // 0번
		anmalList.add(new Tiger()); // 1번
		anmalList.add(new Eagle()); // 2번

		System.out.println("*** 타입변환 ***");
		testcasting();

		/*
		 * // Human객체를 생성 Animal human = new Human();
		 * 
		 * // 생성된 객체를 arrayList에 저장 anmalList.add(human);
		 * 
		 * anmalList.get(0).breathe();
		 */
		/*
		 * // 부모 타입으로 자동 형변환을 구현 Animal animal = new Human(); animal.breathe();
		 * 
		 * // 다운캐스팅으로 강제 형변환 if (animal instanceof Human) { // animal이 Human의 인스턴스 라면
		 * 라면은 신라면이지 Human man = (Human) animal; // 강제 형변환 실행 man.breathe(); // read()를
		 * 사용함 }
		 */

	}// main

	public static void testcasting() {
		for (int i = 0; i < anmalList.size(); i++) {
			// 다형성 - 부모타입으로 객체 생성
			Animal animal = anmalList.get(i);
			animal.breathe();
			// anmalList.get(i).breathe();
			
			// 하쉬 클래스의 메서드 사용
			if (animal instanceof Human) {
				Human human = (Human) animal; // 자식 객체 = (자식)부모 객체
				human.read();
			}else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunt();
			}else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle) animal;
				eagle.fly();
			}else {
				System.out.println("지원하지 않는 타입입니다.");
			}
		}

	}

}// mainclass
