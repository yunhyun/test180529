package java_example_180521;

import java.util.Scanner;

public class Ch5_15_Exercise09 {

	public static void main(String[] args) {
		boolean run = true;		
		
		int studentNum = 0;//학생수를 받아 처리하기 위한 변수 
		int[] scores = null;//
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = scanner.nextInt();
			if(selectNo == 1) {
				//학생수를 입력받아 입력받은 값 만큼의 배열 크기로 설정
				System.out.print("학생수>");
				studentNum=scanner.nextInt();
				//scores배열변수의 크기를 3으로 설정 
				//scores=new int[3];
				//scores 배열 변수의 크기를 입력받은 만큼으로 설정 
				scores=new int[studentNum];
			} else if(selectNo == 2) {
				//입력된 학생 수 만큼의 점수를 입력하여 배열에 저장 
				for(int i=0;i<scores.length;i++) {
					System.out.println((i+1)+"번 째 학생 점수 : ");
					scores[i]=scanner.nextInt();
				}
			} else if(selectNo == 3) {
				//배열에 입력된 값을 하나하나 출력 
				for(int i=0;i<scores.length;i++) {
					System.out.println((i+1)+"번 째 학생 점수 : "+scores[i]);
				}
			} else if(selectNo == 4) {
				//배열에 입력된 값 중 최대값과 평균값을 계산하여 출력 
				int max=0,sum=0;
				double avg=0;
				for(int i=0;i<scores.length;i++) {
					max = (max<scores[i])?scores[i]:max;
					sum += scores[i];
				}
				avg = (double) sum/scores.length;
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
			} else if(selectNo == 5) {
				//반복문 종료 
				run=false;
			}
		}	
		
		System.out.println("프로그램 종료");

	}

}
