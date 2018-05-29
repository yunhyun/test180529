package java_example_180529;

public class Ch7_09_ColorPoint extends Ch7_09_Point {
	private String color; // 점의 색
	void setColor(String color) {
		this.color = color;
	}
	void showColorPoint() { // 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint(); // Point의 showPoint() 호출
	}

}
