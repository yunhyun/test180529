package java_example_180517;
//While문 연습
public class Ch4_13_WhilePrintFrom1To10Example {

	public static void main(String[] args) {
		int i = 1;
		while(i<=10) {
			//while문의 조건식을 만족하는 동안 실행됨. 
			System.out.println(i);
			//i++;
			i+=3;
		}
	}

}
