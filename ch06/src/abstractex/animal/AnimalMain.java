package abstractex.animal;


public class AnimalMain {

	public static void main(String[] args) {
		// Cat cat = new Cat();
		// Dog dog = new Dog();
		// 부모타입으로 객채생성 (다형성)
		Animal cat = new Cat();
		Animal dog = new Dog();

		cat.breathe();
		//	cat.sound();
		cat.showInfo();
		System.out.println();

		// dog.sound();
		
		// animalSound호출
		animalSound(cat);
		animalSound(dog);
		
	
		// 맨날 상속해서 써야하니깐 메소드 하나만 쓸꺼면 걍 바로도 가능하긴함
		// 이름없는 클래스다해서 익명클래스
		Animal test = new Animal() {
			@Override
			public void sound() {
				System.out.println("테스트");
			}
		};
		
		test.sound();
	}

	// 매개변수의 다향성
	private static void animalSound(Animal animal) {
		animal.sound();
	}

}
