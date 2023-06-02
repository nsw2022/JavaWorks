package gamelevel;

public class SuperLevle extends PlayerLevel{
	@Override
	public void run() {
		System.out.println("매우 빨리 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("매우 높이 점프 합니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("한바퀴 돕니다.");
		
	}

	@Override
	public void showLevelMsg() {
		System.out.println("*** 고급자 레벨입니다 ***");
		
	}
}
