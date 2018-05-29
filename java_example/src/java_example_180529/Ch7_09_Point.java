package java_example_180529;

public class Ch7_09_Point {

	private int x, y; // 한 점을 구성하는 x, y 좌표
	void set(int x, int y) {
		this.x = x; this.y = y;
	}
	void showPoint() { // 점의 좌표 출력
		System.out.println("(" + x + "," + y + ")");
	}
}


