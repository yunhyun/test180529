package java_example_180517;

public class Ch4_14_WhileSumFrom1To100Example {

	public static void main(String[] args) {
		int sum=0;
		int i=1;
		while(i<=100) {
			sum = sum + i;
			i++;
		}
		System.out.println(i);
		System.out.println("1부터 100까지의 합 : " + sum);
	}

}
