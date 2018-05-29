package java_example_180515_180516;

import java.util.Scanner;

/*
 * next() : 문자열 입력
 * nextInt() : 정수 입력 
 * nextDouble() : 실수 입력 
 * close() : 스캐너 종료. 
 */

public class Ch3_ScannerExample {

	public static void main(String[] args) {
		//스캐너를 사용하기 위한 스캐너 객체 생성 
		/*Scanner scanner = new Scanner(System.in);
		String name;
		System.out.println("당신의 이름을 입력해주세요 : ");
		name = scanner.next(); //.next() 문자열 입력을 위한 스캐너의 메소드
		System.out.println("당신의 이름은 " + name + "입니다.");
		scanner.close();*/
		
		System.out.println("이름, 도시, 나이, 체중을 빈칸으로 분리하여 입력하세요");

		Scanner scanner = new Scanner(System.in);
		String name = scanner.next(); 
		System.out.println("당신의 이름은 " + name + "입니다.");
		String city = scanner.next(); 
		System.out.println("당신이 사는 도시는 " + city + "입니다.");
		int age = scanner.nextInt(); 
		System.out.println("당신의 나이는 " + age + "살입니다.");
		double weight = scanner.nextDouble(); 
		System.out.println("당신의 체중은 " + weight + "kg입니다.");
		scanner.close();
		
	}

}
