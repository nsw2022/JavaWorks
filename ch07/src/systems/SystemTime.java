package systems;

public class SystemTime {
	public static void main(String[] args) {
		// 수행 시간 측정
		long start, end;
		start = System.currentTimeMillis();
		System.out.println("시작시간"+start);// 시작시간 출력
		long sum = 0;
		for (int i = 1; i < 1000000000; i++) {
			sum += i;
		}
		end = System.currentTimeMillis();
		System.out.println("종료시간"+end);
		System.out.println(sum);
		System.out.println("걸린시간"+(end-start));
		System.out.printf("계산에 소요된 시간 %f초", (double)(end-start)/1000);
		
	}
}
