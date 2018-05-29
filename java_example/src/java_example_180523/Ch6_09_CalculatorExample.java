package java_example_180523;

import java.util.Scanner;

public class Ch6_09_CalculatorExample {

	public static void main(String[] args) {
		//main 클래스의 실행 내용 
		/*
		 * 객체 생성해서 
		 * 정사각형 넓이 구하는 메소드 호출하고 결과 출력 
		 * 직사각형 넓이 구하는 메소드 호출하고 결과 출력
		 */
		Ch6_09_Calculator cal = new Ch6_09_Calculator();
		Scanner scan = new Scanner(System.in);
		
/*		double width=scan.nextDouble();
		double result = cal.areaRectangle(width);*/
		
		cal.height=10;
		cal.width=10;
		double result1 = cal.areaRectangle(cal.width);
		double result2 = cal.areaRectangle(cal.width, cal.height);
		System.out.println("정사각형의 넓이 : "+result1);
		System.out.println("직사각형의 넓이 : "+result2);
	}

}
