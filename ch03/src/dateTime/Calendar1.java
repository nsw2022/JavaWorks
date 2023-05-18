package dateTime;

import java.util.Calendar;

public class Calendar1 {

	public static void main(String[] args) {
		// Calendar 클래스 사용
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.getCalendarType());
		
		// 날짜
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		// 월이 10 미만이면 0을 포함하여 두자리 문자로 표기하며 아니면 그대로 표기함
		String strMonts = (month < 10 ) ? ("0" + month) : ("" + month);
		int date = cal.get(Calendar.DATE);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		
		// 시간
		int hour = cal.get(Calendar.HOUR);
		String strHour = (hour<10) ? ("0" + hour) : (""+ hour);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
		System.out.printf("%d년 %s월 %d일\n",year,strMonts,date);
		System.out.printf("%s시 %d분 %d초\n",strHour,minute,second);
		System.out.printf("%02d시 %02d분 %02d초\n",hour,minute,second);
		
		// 요일		
		// 1일 2월 3화 4수 5목 6금 7토
		int day = cal.get(Calendar.DAY_OF_WEEK);
		String [] days = {"일","월","화","수","목","금","토"};
		
		System.out.println("오늘은 "+days[day-1] + "요일입니다.");
		
		
		
		
		
		
	}

}
