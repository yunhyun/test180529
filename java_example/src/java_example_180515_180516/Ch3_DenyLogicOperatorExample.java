package java_example_180515_180516;
//논리 부정 연산자 
public class Ch3_DenyLogicOperatorExample {

	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play);
		
		//자바에서 !의 의미는 NOT을 의미함. 
		play = !play;//play의 반대 값을 play에 대입
		System.out.println(play);
		
		play = !play;//play의 반대 값을 play에 대입
		System.out.println(play);
	}

}
