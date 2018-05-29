package java_example_180529_01;
//필드의 다형성 예제 
public class CarExample {
	public static void main(String[] args) {
		//Car클래스에 대한 객체 선언 
		//Car 클래스 타입 변수 car 선언 
		Car car = new Car();
		
		//부모클래스 타입의 변수 선언 
		Tire tire = new Tire("aaa",10);
		//자식클래스 타입의 변수 선언
		HankookTire hktire = new HankookTire("한국",10);
		
		tire = hktire;//자식클래스 타입 변수를 부모클래스 타입 변수에 대입
		hktire = (HankookTire) tire;//부모클래스 타입 변수를 자식클래스 타입 변수에 대입
		
		for(int i=1; i<=5; i++) {
			
			int problemLocation = car.run();
			
			switch(problemLocation) {
				case 1:
					System.out.println("앞왼쪽 HankookTire로 교체");
					car.frontLeftTire = new HankookTire("앞왼쪽", 15);
					break;
				case 2:
					System.out.println("앞오른쪽 KumhoTire로 교체");
					car.frontRightTire = new KumhoTire("앞오른쪽", 13);	
					break;
				case 3:
					System.out.println("뒤왼쪽 HankookTire로 교체");
					car.backLeftTire = new HankookTire("뒤왼쪽", 14);	
					break;
				case 4:
					System.out.println("뒤오른쪽 KumhoTire로 교체");
					car.backRightTire = new KumhoTire("뒤오른쪽", 17);		
					break;
			}
			System.out.println("----------------------------------------");
		}
	}
}
