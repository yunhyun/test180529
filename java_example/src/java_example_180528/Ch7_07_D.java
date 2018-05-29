package java_example_180528;

import java_example_180529.Ch7_07_A;

public class Ch7_07_D extends Ch7_07_A {
	 /* D클래스는 C클래스와 동일한 패키지에 선언 
	 * A클래스 포함시키고 A클래스 상속받고 
	 * 생성자를 선언해서 부모 클래스의 필드와 메소드에 접근가능한지 확인 
	 */
	public Ch7_07_D() {
		//부모클래스의 생성자 호출
		super();
		//부모클래스(A클래스)의 필드, 메소드에 접근가능한지 확인 
		this.field="value";
		this.method();
	}
}
