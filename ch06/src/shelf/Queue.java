package shelf;

public interface Queue {
	// 자료구조 - 선입 선출 방식(First in First out)
	void enQueue(String title);//리스트의 맨 마지막 추가
	
	String deQueue();// 리스트의 맨 처음 항목 반환( 0번 인덱스)
	
	int getSize();// 현재 자료형의 개수
	
}
