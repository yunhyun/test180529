package java_example_180528;

public class Ch7_04_SupersonicAirplaneExample {

	public static void main(String[] args) {
		Ch7_04_SupersonicAirplane sa = new Ch7_04_SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode=Ch7_04_SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode=Ch7_04_SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}

}
