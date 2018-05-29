package java_example_180515_180516;
//문자열 비교 연산 예제
public class Ch3_StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "본인이름";
		String strVar2 = "본인이름";
		//new 연산자 : 새로운 객체를 생성할 때 사용하는 연산자
		String strVar3 = new String("본인이름");
		System.out.println( strVar1 == strVar2);
		//true 
		System.out.println( strVar1 == strVar3);
		//false 
		System.out.println();
		//.equals()
		System.out.println( strVar1.equals("본인이름"));
		System.out.println( strVar1.equals(strVar3));
	}

}
