package transport;

public class Main {

	public static void main(String[] args) {
		// 사람 객체 생성
		Person p1 = new Person("승우",10_000);
		Person p2 = new Person("동현",20_000);
		
		// 버스 객체 생성
		Bus bus740 = new Bus("740번 버스");
		
		// 카카오택시 생성
		KakaoTaxi kt1 = new KakaoTaxi("택시기사님");
		
		
		p1.take(bus740, 1300);
		p2.take(bus740, 1000);
		p1.take(kt1, 4800);
		
		p1.showInfo();
		p2.showInfo();
		System.out.println();
		bus740.showInfo();
		kt1.showInfo();
		

	}

}
