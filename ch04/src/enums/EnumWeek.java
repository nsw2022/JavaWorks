package enums;

import java.util.Calendar;

public class EnumWeek {

	public static void main(String[] args) {
		Week today = null; // 객체 자료형은 null 초기화

		Calendar cal = Calendar.getInstance();

//		System.out.println(cal.get(Calendar.YEAR));
		int day = cal.get(Calendar.DAY_OF_WEEK);
		// 1일 2월 3화 4수 5목 6금 7토

		switch (day) {
		case 1:
			today = Week.일;
			break;
		case 2:
			today = Week.월;
			break;
		case 3:
			today = Week.화;
			break;
		case 4:
			today = Week.수;
			break;
		case 5:
			today = Week.목;
			break;
		case 6:
			today = Week.금;
			break;
		case 7:
			today = Week.토;
			break;
		default:
			System.out.println("여기올린없지만 날짜가 아닙니다.");
			break;
		}
		
		System.out.println("오늘은 " + today + "요일 입니다");
		
		if (today == Week.일) System.out.println("일요일에는 영화를 보러 갑니다.");
		else System.out.println("열심히 공부합니다");
		
		
	}

}
