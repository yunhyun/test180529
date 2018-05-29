package java_example_180518;

import java.util.Scanner;

public class Ch4_21_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 숫자맞추기 게임 
		 */
		/* 1. 1~100까지의 난수 발생
		 * 2. 사용자가 숫자를 입력하도록 한다. 
		 * 3. 발생된 난수와 사용자가 입력한 숫자를 비교한다.
		 *   3.1 입력한 숫자가 클 경우 숫자가 큽니다. 출력하고 횟수1회 증가 
		 *   3.2 입력한 숫자가 작을 경우 숫자가 작습니다. 출력하고 횟수1회 증가
		 *   3.3 입력한 숫자가 맞을 경우 맞았습니다. 출력하고 횟수 1회증가 
		 *   3.4 시도횟수 출력
		 *   3.5 반복문 빠져나옴 
		 *   
		 */
		
		int answer=(int)(Math.random()*100)+1;
		int input=0;
		int count=0;
		Scanner scan = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1부터 100까지의 숫자를 입력하세요 : ");
			input=scan.nextInt();
			if(answer>input) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if(answer<input) {
				System.out.println("더 작은 수를 입력하세요.");
			} else {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 "+count+"번 입니다.");
				break;
			} 
		} while(true);
		
	}

}












