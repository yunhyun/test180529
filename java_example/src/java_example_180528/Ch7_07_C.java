package java_example_180528;

//다른 패키지에 소속된 A클래스 import
import java_example_180529.Ch7_07_A;

public class Ch7_07_C {
	 /* C클래스는 다른패키지에 선언
	 * A클래스 포함시키고 
	 * a클래스 객체 만들고 a클래스의 필드, 메소드에 접근가능한지 확인
	 */

	public void method() {
		//A클래스 객체 생성
		//패키지가 다르고 protected로 선언되어 있기 때문에 접근 불가능 
		//Ch7_07_A a = new Ch7_07_A();
		
	}
 
}
