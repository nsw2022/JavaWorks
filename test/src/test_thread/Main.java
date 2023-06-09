package test_thread;

public class Main {
	public static void main(String[] args) {

//		for (int i = 0; i < 20; i++) {
//			System.out.println(i + "번째 파일 다운로드 중...");
//
//			// 강제로 잠시 대기..
//			for (long k = 0; k < 10000000000L; k++) {
//				new String();// 의미 없는 객체 생성. 시간걸리도록.
//			}
//		}
//		for (int i = 0; i < 20; i++) {
//			System.out.println(i + "번째 파일 다운로드 중...");
//			
//			// 강제로 잠시 대기..
//			for (long k = 0; k < 10000000000L; k++) {
//				new String();// 의미 없는 객체 생성. 시간걸리도록.
//			}
//		}
		
		ThreadA a = new ThreadA();
		a.start();
		
		ThreadB b = new ThreadB();
		b.start();
		//a.setPriority(1);//낮음
		//b.setPriority(10);// 높음
		
		for(int k=100; k<200; k++) {
			System.out.println( k +" : " + Thread.currentThread().getName());
			
			// 0.2초 동안 잠시 대기 ( 200 밀리세컨드 )
			try {
				Thread.sleep(200);
			}catch(InterruptedException e) {								
			}			
		}
		

	}// main

}

class ThreadA extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(i + "번째 파일 다운로드 중..." + Thread.currentThread().getName());

			// 강제로 잠시 대기..
			for (long k = 0; k < 10000000000L; k++) {
				new String();// 의미 없는 객체 생성. 시간걸리도록.
			}
		}
	}
}

class ThreadB extends Thread{
	@Override
	public void run() {
		//2) 20개의 음악을 재생하는 작업
		for(int i=0; i<20; i++) {
			System.out.println( i + "번째 음악 재생 중..." + Thread.currentThread().getName());
					
			//강제로 잠시 대기..
			for(long k=0; k<10000000000L; k++) {
				new String();//의미 없는 객체 생성. 시간걸리도록.				
			}
		}
	}
}
