package java_example_180523;
//KoreanExample 클래스 
public class Ch6_04_KoreanExample {

	public static void main(String[] args) {
		//본인의 이름과 주민번호 앞자리로 k1, k2 객체를 각각 생성해서 필드값을 출력해보세요.
		//객체생성 
		Ch6_04_Korean k1 = new Ch6_04_Korean("조윤현","12345566655");
		//필드값 출력 
		System.out.println("Korean 클래스의 name 필드값 :" + k1.name);
		System.out.println("Korean 클래스의 ssn 필드값 :" + k1.ssn);
		
		//객체생성 
		Ch6_04_Korean k2 = new Ch6_04_Korean("조윤현1","3336655");
		//필드값 출력 
		System.out.println("Korean 클래스의 name 필드값 :" + k2.name);
		System.out.println("Korean 클래스의 ssn 필드값 :" + k2.ssn);
		
		
		
	}

}
