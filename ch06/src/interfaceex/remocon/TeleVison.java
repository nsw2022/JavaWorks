package interfaceex.remocon;
// TeleVison은 RemoteControl을 구현한 구현클래스임.
public class TeleVison implements RemoteControl{
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
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
	

	
}
