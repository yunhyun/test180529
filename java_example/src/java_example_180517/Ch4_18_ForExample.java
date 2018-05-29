package java_example_180517;

import java.util.Scanner;

public class Ch4_18_ForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1부터 입력받은 수까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 계산하시오.
		 */
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		System.out.println("숫자를 입력해주세요 : ");
		int num = scan.nextInt();
		for(int i=1; i<=num; i++) {
			//2의배수로 판단 : num%2==0
			//3의배수로 판단 : num%3==0
			if(i%2 != 0 && i%3 !=0 ) {
				sum = sum + i;
			}
		} 
		System.out.println("합계 : " + sum);
		
	}	

}
