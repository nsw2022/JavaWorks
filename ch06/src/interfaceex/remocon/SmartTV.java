package interfaceex.remocon;
//  RemoteControl,Searchable 구현한 클래스
public class SmartTV implements RemoteControl,Searchable{
	
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("스마트 TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("스마트 TV를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if (volume > MAX_VOLUME) { // 최대 볼륨
			this.volume=MAX_VOLUME;
		}else if (volume < MIN_VOLUME) { // 최소 볼륨
			this.volume = MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		

		System.out.println("현재볼륨은 "+this.volume);
		
	}

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
		
	}

	

}
