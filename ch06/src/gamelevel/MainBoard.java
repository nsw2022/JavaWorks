package gamelevel;

public class MainBoard {
	public static void main(String[] args) {
		//Player 객체 생성
		Player player = new Player();
		// 처음 생성된 플레이어는 초보자
		player.play(1);
		System.out.println();
		
		// 중급자 레벨
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		// 상급자 레벨
		SuperLevle sLevle = new SuperLevle();
		player.upgradeLevel(sLevle);
		player.play(3);
		
		
	}
}
