package java_example_180515_180516;
//삼항연산자 예제
/*
 * 형식 : (조건식) ? 조건이 true일때의 결과 : 조건이 false일때의 결과  
 */
public class Ch3_ConditionalOperationExample {

	public static void main(String[] args) {
		
		int score = 85;
		char grade = (score>90)? 'A' : 'B';
		/*
		 * if(score>90) {
		 * 	grade = 'A'; 
		 * } else {
		 *  grade = 'B'; 
		 * } 
		 */
		
		
		//score가 90보다 크면 grade에 A를 저장, 90보다 작거나 같으면 B를 저장
		//char grade = (score>90)? 'A' : ((score>80)?'B':'C');
		System.out.println("당신의 성적은  " + grade + "입니다");
		
	}

}
