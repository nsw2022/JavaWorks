package nestedclass.innerclass;


public class MessageListener implements Message.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("문자를 보냅니다.");
		
	}

}
