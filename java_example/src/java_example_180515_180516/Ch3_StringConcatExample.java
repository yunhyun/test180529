package java_example_180515_180516;
//문자열 연결 연산자 87p
public class Ch3_StringConcatExample {

	public static void main(String[] args) {
		//String 문자열을 저장할 수 있는 타입
		String str = "스트링변수 저장 및 선언";
		String str1 = "JDK" + 8.0;//JDK8.0
		String str2 = str1 + "특징";//JDK8.0특징
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;//연결개념 JDK33.0
		String str4 = "3" + "3.0" + "JDK";//앞에선 연산 뒤는 연결 6.0JDK
		System.out.println(str3);
		System.out.println(str4);	
		
	}

}
