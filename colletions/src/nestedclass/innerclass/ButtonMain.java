package nestedclass.innerclass;

public class ButtonMain {
	public static void main(String[] args) {
		Button button = new Button();
		button.setListener(new CallListener());
		button.touch();
		
		// 사진찍기 - 익명 객체 구현
		button.setListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("사진을 찍습니다.");
				
			}
		});
		button.touch();
	}
}
