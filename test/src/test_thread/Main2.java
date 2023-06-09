package test_thread;

public class Main2 {

	public static void main(String[] args) {
		PersonThread pt = new PersonThread();
		Thread t = new Thread(pt);
		t.start();

		System.out.println("aaa");

		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("익명클래스");

			}
		};

		Thread t2 = new Thread(r);
		t2.start(); // r객체의 run메소드가 대신 발동됨.

		// 인터페이스를 구현하는 익명클래스를 만들면서 Thread의 생성자함수 파라미터에 전달
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("kkkkkkkkkk");
			}
		});
		t3.start();
	}

}

class PersonThread extends Person implements Runnable {

	@Override
	public void run() {
		// 1초마다 본인의 멤버값(name, age)을 5번 출력하는 기능구현
		for (int i = 0; i < 5; i++) {
			System.out.println(name + " , " + age + " - " + Thread.currentThread().getName());

			// 1초간 스레드 잠재우기
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class Person {
	String name;
	int age;
}