package abstractex.template;

public class AICAR extends Car{

	@Override
	public void drive() {
		 System.out.println("자동차가 자율주행" );
	}
	@Override
	public void stop() {
		System.out.println("자동차가 스스로 멈춥니다.");
		
	}
	



}
