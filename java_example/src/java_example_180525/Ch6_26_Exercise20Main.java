/*package java_example_180525;

import java.util.Scanner;

public class Ch6_26_Exercise20Main {
	public static void main(String[] args) {
		Ch6_25_Exercise20[] accountArray = new Ch6_25_Exercise20[100];
		Scanner scanner = new Scanner(System.in);
	
	
		boolean run = true;		
		while(run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	

	}
}
*/