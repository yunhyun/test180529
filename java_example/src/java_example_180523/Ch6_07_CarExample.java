package java_example_180523;

public class Ch6_07_CarExample {

	public static void main(String[] args) {
		//Car 클래스의 객체 생성 
		Ch6_07_Car car = new Ch6_07_Car();
		//setGas 메소드 호출. 매개값은 5. 
		car.setGas(5);
		
		//isLeftGas 메소드 호출결과를 gasState라는 변수에 담으세요. 
		boolean gasState = car.isLeftGas();
		
		System.out.println(car.gas);
		
		if(gasState) {
			System.out.println("출발합니다.");
			car.run();
		} 
		//여기까지 실행됐을 때 gas 필드 값은??
		System.out.println(car.isLeftGas());
		
		System.out.println(car.gas);
		
		if(car.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
		
	}

}






