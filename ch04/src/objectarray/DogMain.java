package objectarray;

public class DogMain {
	
	public static void main(String[] args) {
		// 강아지 3마리 생성하기 - 배열 공간 생성
		Dog[] dogAraay = new Dog[3];
		
		//dogArray[0] = new Dog()
		for (int i = 0; i < dogAraay.length; i++) {
			// 각각의 배열요소의 객체 생성
			dogAraay[i] = new Dog();
		}
		
		
		dogAraay[0].setName("코코");
		dogAraay[0].setType("코카스파니엘");
		
		dogAraay[1].setName("백구");
		dogAraay[1].setType("진돗개");
		
		for (Dog dog : dogAraay) {
			if (dog.getName() != null) {
				System.out.println("이름: "+dog.getName());
				System.out.println("종류: "+dog.getType());
			}
			System.out.println();
		}
		
		
	}
	
}
