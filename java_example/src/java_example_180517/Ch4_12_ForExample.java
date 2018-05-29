package java_example_180517;

import java.util.Scanner;

public class Ch4_12_ForExample {

	public static void main(String[] args) {
		//출력 형태 
		//1+2+3+4+5+6+7+8+9+10=55
		
		int i, sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("시작값을 입력하세요 : ");
		int startNum = scan.nextInt();
		System.out.println("끝 값을 입력하세요 : ");
		int endNum = scan.nextInt();
		
		for(i=startNum; i<=endNum; i++) { // 1~10까지 반복
			sum += i;
			System.out.print(i); // 더하는 수 출력

			if(i<=(endNum-1)) // 1~9까지는 '+' 출력
				System.out.print("+");
			else { // i가 10인 경우
				System.out.print("="); // '=' 출력하고
				System.out.print(sum); // 덧셈 결과 출력
			}
		}

	}

}
