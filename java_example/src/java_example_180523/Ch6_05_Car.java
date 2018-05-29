package java_example_180523;
//생성자(Constructor) Overloading 예제 
public class Ch6_05_Car {

	//field 선언
	String company="현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//여러 종류의 생성자 선언해보기 
	/* 1. 기본 생성자
	 * 2. model을 매개변수로 하는 생성자
	 * 3. model, color를 매개변수로 하는 생성자
	 * 4. model, color, maxSpeed를 매개변수로 하는 생성자 
	 */
	//기본생성자 선언
	Ch6_05_Car() {
		
	}
	
	//model을 매개변수로 하는 생성자 
	/*Ch6_05_Car(String m){
		model=m;
	}*/
	Ch6_05_Car(String model){
		/*this.model=model;*/
		this(model,"은색",300);
		//현재 클래스에 있는 (String, String, int)형태의 생성자를 호출하여 매개값을 
		//넘길 때 사용하는 this() 방법 
	}
	//model, color를 매개변수로 하는 생성자
	Ch6_05_Car(String model, String color){
		this.model=model;
		this.color=color;
	}
	//model, color, maxSpeed를 매개변수로 하는 생성자 
	Ch6_05_Car(String model, String color, int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	
}









