package java_example_180525;

import java.util.Scanner;

public class Ch6_23_AbsValueMain {

	public static void main(String[] args) {
		//절대값 및 두점 사이의 거리 구하기 
		Scanner scan = new Scanner(System.in);
		Ch6_23_AbsValue abs = new Ch6_23_AbsValue();
		boolean run = true;
		
		while(run) {
			System.out.println("-------------------");
			System.out.println("수행할 내용을 선택하세요.");
			System.out.println("1. 두점 사이의 거리 구하기 ");
			System.out.println("2. 절대값 구하기 ");
			System.out.print("선택>>");
			int choice=scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("두 점을 (x,y)순으로 입력해주세요.");
				System.out.print("첫번째 x좌표");
				int x1=scan.nextInt();
				System.out.print("첫번째 y좌표");
				int y1=scan.nextInt();
				System.out.print("두번째 x좌표");
				int x2=scan.nextInt();
				System.out.print("두번째 y좌표");
				int y2=scan.nextInt();
				double result=abs.getDistance(x1, y1, x2, y2);
				System.out.println("두 점 사이의 거리는 "+result +"입니다.");
				break;
			case 2:
				System.out.println("정수를 입력해주세요.");
				int num=scan.nextInt();
				int absValue=abs.getAbsValue(num);
				System.out.println("입력하신 정수의 절대값은 " + absValue+"입니다.");
				break;
			}
			
		}
	}

}
