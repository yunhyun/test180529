package java_example_180515_180516;

//자동 타입(변수) 변환 예제
public class Ch2_PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		//byte 타입의 변수 byteValue 선언하면서 초기값 10으로 줌. 
		
		int intValue = byteValue; 
		//기존 byte 타입의 변수가 int 타입으로 자동 타입변환 발생 
		System.out.println(intValue);

		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드=" + intValue);
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);		
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
	}

}
