package java_example_180529;

public class Ch7_10_CarExample {

	public static void main(String[] args) {
		//Sedan, Truck에 대한 객체 각각 생성 
		Ch7_10_Sedan sedan = new Ch7_10_Sedan(100, "빨간색");
		Ch7_10_Truck truck = new Ch7_10_Truck(50, "검정색", 5);
		
		//세단, 트럭의 속도 증가 
		sedan.speedUp(100);
		truck.speedUp(50);
		
		sedan.setSeatNum(5);
		
		System.out.println(sedan.color+"승용차 속도는 "+sedan.speed
				+"이고 좌석수는 "+ sedan.getSeatNum()+"개 입니다. ");
		System.out.println(truck.color+"트럭 속도는 "+truck.speed
				+"이고 적재량은 "+ truck.getCapacity()+"톤 입니다. ");
		
		
	}
}
