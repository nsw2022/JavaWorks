package colletions.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentTest {

	public static void main(String[] args) {
		
		// 중복 저장 불허하는 자료구조 사용 - Set
		Set<Student> set = new HashSet<>();
		
		set.add(new Student("이순신"));
		set.add(new Student("이순신"));
		set.add(new Student("세종대왕"));
		set.add(new Student("홍길동"));
		System.out.println("총 객체수: " + set.size());
		
		for (Student student : set) System.out.print(student.name + " ");
		System.out.println();
		
		Iterator<Student> ir = set.iterator();
		while (ir.hasNext()) {
			Student element = ir.next();
			System.out.println('\t' + element.name);
		}

	}

}
