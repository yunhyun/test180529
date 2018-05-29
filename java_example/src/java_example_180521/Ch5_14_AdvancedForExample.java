package java_example_180521;

public class Ch5_14_AdvancedForExample {

	public static void main(String[] args) {
		/*
		 * 향상된 for문 (for-each문)
		 */
		
		int[] scores= {95,85,90,66,88};
		int sum=0;
		
		//for-each문
		//score는 반복을 위한 변수 
		for(int score : scores) {
			sum = sum + score;
			System.out.println(score);
		}
		System.out.println("점수 총합 : " +sum);
	}

}
