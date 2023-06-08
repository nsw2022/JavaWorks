package systems;

public class SystemNanoTime {
	public static void main(String[] args) {
		double start, end;
		start = System.nanoTime();

		long sum = 0;
		for (int i = 0; i < 1_000_000_000; i++) {
			sum += i;
		}
		end = System.nanoTime();
		System.out.println(end);
		//	나노초(Nanosecond): 10의 -9승 (10^-9)
		//	마이크로초(Microsecond): 10의 -6승 (10^-6)
		//	밀리초(Millisecond): 10의 -3승 (10^-3)
		System.out.printf("계산에 소요된 시간: %.0f 나노초\n", (end - start));
		System.out.printf("계산에 소요된 시간: %.2f 밀리초\n", (end - start) / 1_000_000_000);
		System.out.printf("계산에 소요된 시간: %.2f 마이크로초\n", (end - start) / 1_000);

	}
}
