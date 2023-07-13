package nestedclass.innerclass;



public class Message {
	private OnClickListener listener;
	
	interface OnClickListener{//내부인터페이스
		public void onClick();
	}
	
	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	// 버튼이 터치하는 메서드
	public void touch() {
		listener.onClick();
	}
}
