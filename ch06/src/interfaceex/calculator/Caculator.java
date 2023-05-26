package interfaceex.calculator;

public interface Caculator {
	// 정수형 계산기
	// 인터페이스는 컴파일 과정에서 상수로 변환됨
	// final 생략되있음
	int Error = -999;
	int add(int n1,int n2);
	int subtract(int n1, int n2);
	int times(int n1, int n2);
	int divide(int n1, int n2);
}
