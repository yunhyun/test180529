package java_example_180518;

public class Ch4_19_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 문제 : 1+(-2)+3+(-4)+....형태로 더했을 때 얼마까지 더해야 총 합이 
		 * 100 이상이 되는지 구해보시오. 
		 */
		int sum=0;//합계용 변수
		int num=1;//숫자용 변수
		int count=1;//카운트용 변수 
		int s=1;//부호용 변수
		
		/*while(true) {
			sum=sum+num;
			if(sum>=100)
				break;
			count++;//순차적 숫자 증가를 위한 증감연산자
			s=-s;//부호 변경(s를 -1로 선언해도 무방)
			num=s*count;
		}*/
		for(count=1;sum<100;count++,s=-s) {
			num=count*s;
			sum=sum+num;
		}
		
		
		System.out.println("숫자 : " + num);
		System.out.println("합계 : " + sum);
	}
}










