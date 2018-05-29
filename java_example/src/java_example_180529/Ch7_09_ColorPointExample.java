package java_example_180529;

public class Ch7_09_ColorPointExample {

	public static void main(String[] args) {
		Ch7_09_Point p = new Ch7_09_Point(); 	// Point 객체 생성
		p.set(1, 2); 						// Point 클래스의 set() 호출
		p.showPoint();

		Ch7_09_ColorPoint cp = new Ch7_09_ColorPoint(); 
		cp.set(3, 4); 						// Point 클래스의 set() 호출
		cp.setColor("red"); 			// ColorPoint의 setColor() 호출
		cp.showColorPoint(); 		// 컬러와 좌표 출력

	}

}
