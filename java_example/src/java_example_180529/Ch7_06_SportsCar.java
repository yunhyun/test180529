package java_example_180529;

public class Ch7_06_SportsCar extends Ch7_06_Car {
	//speedUp 메소드 재정의 
	@Override
	public void speedUp() {
		speed += 10;
	}
	//stop 메소드 재정의 
	/*@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤 ");
		speed=0;
	}*/
}
