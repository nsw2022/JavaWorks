package ifexample;



public class Switchcase1 {
	
	public static void main(String[] args) {
		// switch ~ case문 (조건 값이 정해져 있을때 주고 사용
		// 순위에 따른 메달 색상 출력
		int rank = 1;
		String medalColor = " ";
		
		switch (rank) {
		
		case 1:
			medalColor = "Gold";
			break;
			
		case 2:
			medalColor = "Silver";
			break;
			
		case 3:
			medalColor = "Bronz";
			break;

		default:
			medalColor = "None";
			System.out.println("메달이 없습니다.");
			break;
		}
		System.out.println("매달 색깔은 " + medalColor + "입니다.");
	}

}
