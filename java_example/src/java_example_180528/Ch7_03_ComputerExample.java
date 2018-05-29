package java_example_180528;

public class Ch7_03_ComputerExample {

	public static void main(String[] args) {
		int r=10;
		
		//부모 클래스의 메소드 호출 
		Ch7_03_Calculator calculator = new Ch7_03_Calculator();
		System.out.println("부모클래스 메소드 호출 : "+calculator.areaCircle(r));
		
		//자식 클래스에서 재정의된 메소드 호출 
		Ch7_03_Computer computer = new Ch7_03_Computer();
		System.out.println("자식클래스 메소드 호출 : "+computer.areaCircle(r));
		
	}

}
