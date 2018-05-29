package java_example_180528;

public class Ch7_01_DmbCellPhoneExample {

	public static void main(String[] args) {
		//DmbCellPhone에 대한 객체 생성 
		Ch7_01_DmbCellPhone dmbCellPhone = 
				new Ch7_01_DmbCellPhone("자바폰","검정",10);
		
		//model, color 필드는 부모의 필드지만 상속을 받았기 때문에 
		//자식클래스에서 접근이 가능함. 
		System.out.println("모델 : "+dmbCellPhone.model);
		System.out.println("색상 : "+dmbCellPhone.color);
		System.out.println("채널 : "+dmbCellPhone.channel);
		
		
		//생성한 객체의 model, color, channel 값을 각각 출력 
		
		//부모 클래스에서 선언한 메소드 각각 호출 
		dmbCellPhone.powerOn();
		
		
		//자식 클래스에서 선언한 메소드 각각 호출
		dmbCellPhone.changeChannelDmb(12);
	}

}








