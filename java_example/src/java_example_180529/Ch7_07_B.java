package java_example_180529;

public class Ch7_07_B {
	 /* B클래스
	 * 메소드를 선언해서 
	 * a클래스 객체 만들고 a클래스의 필드, 메소드에 접근가능한지 확인 
	 */

	public void method() {
		//A클래스의 객체 생성 
		Ch7_07_A a = new Ch7_07_A();
		//A클래스에서 선언한 필드에 접근 가능한지 
		a.field="value";
		//A클래스에서 선언한 메소드에 접근 가능한지
		a.method();
	}
	
}
