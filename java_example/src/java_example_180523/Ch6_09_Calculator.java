package java_example_180523;
//method overloading p.232
public class Ch6_09_Calculator {
	double width;
	double height;
	
	//정사각형의 넓이를 구하는 메소드
	//메소드 이름 : areaRectangle
	double areaRectangle(double width) {
		this.width=width;
		double area = width*width;
		return area;
	}
	//직사각형의 넓이를 구하는 메소드
	double areaRectangle(double width, double height) {
		double area = width*height;
		return area;
	}
}





