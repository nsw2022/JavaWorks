package arraylist.studentlist;

import java.util.ArrayList;

import arraylist.scorlist.Subject;

public class Student {
	// field 필드(멤버변수)
	int studentId; 	   // 학번
	String sutdentName;// 이름
	ArrayList<Subject> subjectList;
	
	// 생성자
	public Student(int studentId,String sutdentName) {
		this.studentId=studentId;
		this.sutdentName=sutdentName;
		subjectList = new ArrayList<>();	
	}
	
	// 과목 추가
	public void addSubject(String name, int score  ) {
		Subject subject = new Subject();  // 과목 객체 생성
		subject.setScorePoint(score);	  // 과목 이름 입력
		subject.setSubjectName(name);     // 점수 입력
		subjectList.add(subject);  		  // 객체를 어레이리스트에 저장
	}
	
	// 학생 정보 출력
	public void showInfo() {
		int total = 0;
		double avg;
		for (int i = 0; i < subjectList.size(); i++) {
			Subject subject =  subjectList.get(i);
			total += subject.getScorePoint();
			
			System.out.printf("학생 %s의 %s과목의 성적은 %d점입니다.\n"
					,sutdentName,subject.getSubjectName(),subject.getScorePoint());
			
		}
		// 평균 계산
		avg = (double)total/subjectList.size();
		
		System.out.printf("총점:%d\n",total);
		System.out.printf("평균:%.1f\n",avg);
	}
	
}
