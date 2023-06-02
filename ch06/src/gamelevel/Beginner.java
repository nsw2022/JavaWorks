package gamelevel;

public class Beginner extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("jump할줄 모르지롱~.");
		
	}

	@Override
	public void turn() {
		System.out.println("turn할줄 모르지롱~.");
		
	}

	@Override
	public void showLevelMsg() {
		System.out.println("초보자 레벨입니다.");
		
	}

}
