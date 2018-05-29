package java_example_180521;

import java.util.Scanner;

public class Ch5_10_ArrayExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 문제 
		 * 정수 5개를 입력받아  내림차순으로 정렬하시오.  
		 */
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int temp;//자리 바꿈을 위한 임시용 변수 
		System.out.println("정수 5개를 입력하세요 : ");
		//정수 입력을 위한 반복문
		for(int i=0;i<num.length;i++) {
			num[i]=scan.nextInt();
		}
		//내림차순 정렬을 위한 처리 부분 
		for(int j=0;j<num.length;j++) {
			for(int k=j+1;k<num.length;k++) {
				if(num[j]<num[k]) {
					temp=num[j];
					num[j]=num[k];
					num[k]=temp;
				}
			}
		}
		for(int n=0;n<num.length;n++)
			System.out.print(num[n]);
		
		
	}

}










