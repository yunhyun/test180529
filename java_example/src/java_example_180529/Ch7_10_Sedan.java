package java_example_180529;

public class Ch7_10_Sedan extends Ch7_10_Car {

	//필드
	private int seatNum;

	public Ch7_10_Sedan(int speed, String color) {
		super(speed, color);
	}	
	
	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	
	
	
}
