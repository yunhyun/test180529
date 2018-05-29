package java_example_180523;

public class Ch6_06_CalculatorExample {

	public static void main(String[] args) {
		//Calculator 객체 생성
		Ch6_06_Calculator cal = new Ch6_06_Calculator();
		//powerOn 메소드 호출
		cal.powerOn();
		
		//plus 메소드 호출(매개 값은 알아서..) 및 호출 결과 출력
		int result=cal.plus(10, 20);//호출 결과는 30
		System.out.println(result);
		
		//divide 메소드 호출(매개 값은 알아서..) 및 호출 결과 출력
		double result1=cal.divide(10, 20);
		System.out.println(result1);
		
		//powerOff 메소드 호출
		cal.powerOff();
	}

}
