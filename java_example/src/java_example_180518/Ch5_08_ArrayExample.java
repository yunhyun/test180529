package java_example_180518;

import java.util.Scanner;

public class Ch5_08_ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 3열짜리 1차원 배열을 선언하고
		 * 스캐너를 이용하여 값을 하나하나 입력하고 
		 * 입력된 값의 총 합 및 평균 값을 구하시오.  
		 */
		Scanner scan = new Scanner(System.in);
		int[] num=new int[3];
		int sum=0, avg=0;
		for(int i=0;i<num.length;i++) {
			System.out.print((i+1)+"번째 숫자를 입력하세요 : ");
			num[i]=scan.nextInt();
			sum=sum+num[i];
		}
		for(int j=0;j<num.length;j++) {
			System.out.println((j+1)+"번째 입력한 숫자는 : " + num[j]);
		}
		avg=sum/num.length;
		System.out.println("총 합은 : "+ sum);
		System.out.println("평균은 : "+ avg );
		
	}

}
