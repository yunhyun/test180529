package java_example_180515_180516;
//비교연산자 사용하기 p.88
public class Ch3_CompareOperatorExample {

	public static void main(String[] args) {
		/*
		 * 비교 연산자의 종류 
		 * 비교연산자는 연산 결과가 무조건 true, false로 나옴. 
		 * == : 양변이 같으면 결과는 true, 다르면 false
		 * != : 양변이 다르면 결과는 true, 같은면 false
		 * >, >=, <, <=
		 * 5>3 : true */
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);//num1과 num2가 같은지  
		boolean result2 = (num1 != num2); //num1과 num2가 다르면 true
		boolean result3 = (num1 <= num2);
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);
		char char1 = 'A';//65
		char char2 = 'B';//66
		boolean result4 = (char1 < char2);
		System.out.println("result4=" + result4);	
	}

}
