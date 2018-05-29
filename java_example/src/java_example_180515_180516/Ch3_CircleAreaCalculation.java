package java_example_180515_180516;

import java.util.Scanner;

public class Ch3_CircleAreaCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원의 반지름을 입력하세요 : ");
		double radius = sc.nextDouble();
		double areaWithPi = radius*radius*Math.PI;
		double area = radius*radius*3.14;
		System.out.println("원의 면적은 " + area + "입니다.");
		System.out.println("pi를 이용한 원의 면적은 " + areaWithPi + "입니다.");
		System.out.println(Math.PI);
		sc.close();
	}

}
