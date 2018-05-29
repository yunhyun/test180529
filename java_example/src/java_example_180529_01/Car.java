package java_example_180529_01;

public class Car {
	//필드
	//각 필드는 Tire 클래스 타입으로 선언됨.(객체) 
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	//위의 내용을 배열로 
	//Tire 클래스 타입의 배열 변수를 선언해서 우변에 있는 내용을 각각 배열 변수에 대입
	Tire[] tire = new Tire[100];
	Tire[] tire1 = {};
	Tire[] tire2 = {
			new Tire("앞왼쪽", 6),
			new Tire("앞오른쪽", 2),
			new Tire("뒤왼쪽", 3),
			new Tire("뒤오른쪽", 4)
	};
	
	/*tire2[0] = new Tire("앞왼쪽", 6);
	tire2[1] = new Tire("앞오른쪽", 2);
	tire2[2] = new Tire("뒤왼쪽", 3);
	tire2[3] = new Tire("뒤오른쪽", 4);*/
	
	
	
	
	//생성자
	
	//메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false) { 
			stop(); 
			return 1; }
		if(frontRightTire.roll()==false) { 
			stop(); 
			return 2; }
		if(backLeftTire.roll()==false) { 
			stop(); 
			return 3; }
		if(backRightTire.roll()==false) { 
			stop(); 
			return 4; }
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
