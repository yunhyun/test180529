package java_example_180517;

import java.util.Scanner;

//중첩 if문 
public class Ch4_05_IfNestedExample {

	public static void main(String[] args) {
		/*
		 * 점수를 입력 받고
		 * 
		 * 90점 이상인 점수에 대해 95점 이상이면 A+
		 * 90이상 95미만이면 A
		 * 85~89 B+
		 * 80~84 B
		 * 75~79 C+
		 * 70~74 C
		 * 65~69 D+
		 * 60~64 D
		 * 60미만 F 
		 * if문이 끝나면 학점을 출력하는 print문 사용 
		 * 주의할 점은 학점 값을 처리하는 String 타입의 변수를 하나 사용 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("당신의 점수를 입력해주세요.");
		int score = scan.nextInt();
		String grade=null;
		if(score<=100) {
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if(score>=80) {
			if(score>=85)
				grade = "B+";
			else
				grade = "B";
		} else {
			grade = "F";
		}
		}else {
			System.out.println("점수 입력 범위를 벗어났습니다.");
		}
		System.out.println("당신의 학점은 " + grade + "입니다.");
		
	}

}












