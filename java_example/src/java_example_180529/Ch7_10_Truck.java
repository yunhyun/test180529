package java_example_180529;

public class Ch7_10_Truck extends Ch7_10_Car {
	private int capacity;
	
	public Ch7_10_Truck(int speed, String color, int capacity) {
		super(speed, color);
		this.capacity = capacity;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	
}
