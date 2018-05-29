package java_example_180524;

public class Ch6_10_CarExample {

	public static void main(String[] args) {
		Ch6_10_Car myCar = new Ch6_10_Car("포르쉐");
		//객체를 생성할 때 매개변수를 어떻게 전달했는지.. 
		//String 한개=>생성자를 선언 
		Ch6_10_Car yourCar = new Ch6_10_Car("벤츠");
		
		//메소드호출 
		//run() 메소드 호출했을 때 어떤 결과가 나오는지.. 
		myCar.run();
		
		
		yourCar.run();
	}

}
