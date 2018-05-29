package java_example_180529_01;

public class Tire {
	public int maxRotation;     			
	public int accumulatedRotation;		
	public String location;       			

	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	//메소드
	//Tire frontLeftTire = new Tire("앞왼쪽", 6);
	//Tire frontRightTire = new Tire("앞오른쪽", 2);
	//Tire backLeftTire = new Tire("뒤왼쪽", 3);
	//Tire backRightTire = new Tire("뒤오른쪽", 4);

	public boolean roll() {
		//accumulatedRotation=0
		++accumulatedRotation;//1
		//accumulatedRotation=1, maxRotation=6
		//accumulatedRotation=1, maxRotation=2
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " Tire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}
