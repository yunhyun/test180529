package java_example_180517;
//for문을 이용하여 1부터 100까지 더하기 
public class Ch4_10_ForSumFrom1To100Example {

	public static void main(String[] args) {
		int sum=0;//합계를 담을 변수 sum
		String num = null;
		
		for(int i=1; i<=100; i++) {
		//1+2+3+4+5+~~~~100	
		//1+2=3+3=6+4=10+5=15
			sum = sum + i;
		}
		System.out.println("1~100까지의 합 : " + sum );
	}

}
