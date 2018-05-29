package java_example_180515_180516;

import java.util.Scanner;

public class Ch3_ScannerExample_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("초를 입력하세요 : ");
		int time = scan.nextInt();
		int hour = time/3600;//시간 
		int minute = (time%3600)/60;
		int second = (time%3600)%60;
		System.out.println(time+"초는 "+hour+"시간"+minute+"분"+second+"초 입니다.");
	}

}
