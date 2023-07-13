package nestedclass.innerclass;

public class MessageMain {

	public static void main(String[] args) {
		Message message = new Message();
		
		message.setListener(new MessageListener());
		message.touch();

	}

}
