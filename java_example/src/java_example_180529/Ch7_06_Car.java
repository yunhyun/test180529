package java_example_180529;

public class Ch7_06_Car {
	//필드, 메소드, final메소드 
	public int speed;
	
	public void speedUp() {
		speed += 1;
	}
	
	//final 메소드 
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
	
	//SportsCar클래스 선언 메소드, final 메소드 재정의 
}
