package java_example_180529;

public class Ch7_10_Car {
	//필드 
	int speed;
	String color;
	
	//생성자 
	public Ch7_10_Car(int speed, String color) {
		this.speed = speed;
		this.color = color;
	}
	
	//메소드 
	public void speedUp(int speed) {
		this.speed = this.speed + speed;
	}
	public void speedDown(int speed) {
		this.speed = this.speed - speed;
	}
}
