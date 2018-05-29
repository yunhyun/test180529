package java_example_180525;

import java.util.Scanner;

public class Ch6_22_MemberServiceExample {

	public static void main(String[] args) {
		Ch6_22_MemberService memberService = new Ch6_22_MemberService();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		System.out.println("-----------------");
		System.out.println("수행할 서비스를 선택해주세요.");
		System.out.println("1.로그인  || 2.로그아웃");
		System.out.print(">>");
		int choice=scan.nextInt();
		switch(choice) {
		case 1:
			System.out.print("아이디를 입력하세요 : ");
			String id = scan.next();
			
			System.out.print("비밀번호를 입력하세요 : ");
			String pwd = scan.next();
			
			boolean result = memberService.login(id, pwd);
			if(result) {
				System.out.println(id+"님 로그인 되었습니다.");
			
			} else {
				System.out.println("id 또는 password가 올바르지 않습니다.");
			}
			break;
		case 2:
			memberService.logout();
			break;
		}
		
		}
	}

}
