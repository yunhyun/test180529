package java_example_180517;

public class Ch4_16_BreakExample {

	public static void main(String[] args) {
		//무한 반복문 
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			//주사위가 6이 나왔을 때 반복문 종료 
			if(num==6) {
				break;
			}
		}
		
		System.out.println("반복문 종료됨. ");
	}

}
