package gamelevel;

public class Player {
	
	
	// 필드
	private PlayerLevel level;

	// 생성자
	public Player() {
		level = new Beginner();
		level.showLevelMsg();
	}
	
	// showLevelMsg 변경하는 메서드(다형성) // set레벨
	public void upgradeLevel(PlayerLevel level) {
		this.level=level;
		level.showLevelMsg();
	}
	
	//play 하는 메서드
	public void play(int count) {
		level.go(count);
	}
	
	
}
