package java_example_180518;

import java.util.Scanner;

public class Ch4_22_Exercise07 {

	public static void main(String[] args) {
		boolean run = true;	//	
		int balance = 0;//잔고 변수 
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			
			int menuNum = scanner.nextInt();//기능선택 변수
			
			switch(menuNum) {
				case 1:
					System.out.print("예금액>");
					int deposit =scanner.nextInt(); 
					balance += deposit;
					System.out.println("현재잔액은 "+balance+"입니다.");
					break;
				case 2:
					System.out.print("출금액>");
					int withdraw = scanner.nextInt();
					balance -= withdraw;
					if(balance<0) {
						System.out.println("잔고가 부족합니다.");
						balance=balance+withdraw;
						System.out.println("현재잔액은 "+balance+"입니다.");
					}
					break;
				case 3:
					System.out.print("잔고>");
					System.out.println("현재잔액은 "+balance+"입니다.");
					break;
				case 4:
					run = false;//반복을 종료
					break;	
			} 
			
			System.out.println();			
		}	
		
		System.out.println("프로그램 종료");

	}

}
