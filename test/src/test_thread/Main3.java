package test_thread;

public class Main3 {
	public static void main(String[] args) {
		Account acc = new Account();
		TestThread t1 = new TestThread(acc);
		TestThread t2 = new TestThread(acc);
		t1.start();
		t2.start();
	}
}

class Account {
	int money = 0;

	void add(int m) {
		String name = Thread.currentThread().getName();

		System.out.println(name + " : 입금작업을 시작합니다.");
		System.out.println(name + " : 입금 전 잔액 : " + money);

		money += m;

		// 전산처리 시간을 가정하여..오래걸리도록..쓸데없는.코드
		for (long i = 0; i < 20000000000L; i++) {
			new String("aaa");
			new String("bbb");
			new String("ccc");
		}

		System.out.println(name + " : 입금 후 잔액 : " + money);
		System.out.println();
	}
	
	synchronized void add2(int m) {
String name= Thread.currentThread().getName();
		
		System.out.println(name+" : 입금작업을 시작합니다.");		
		System.out.println(name+" : 입금 전 잔액 : " + money);
		
		money += m;
		
		//전산처리 시간을 가정하여..오래걸리도록..쓸데없는.코드
		for(long i=0; i<90000000000L; i++) {
			new String("aaa");
			new String("bbb");
			new String("ccc");
		}
		
		System.out.println(name+" : 입금 후 잔액 : " + money);
		System.out.println();
	}
}

class TestThread extends Thread{
	Account acc;
	
	
	public TestThread(Account acc) {
		this.acc=acc;
	}
	
	@Override
	public void run() {
		//acc.add(100);
		acc.add2(100);
	}
}