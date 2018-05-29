package java_example_180517;
//char타입을 변수로하는 switch case문
public class Ch4_07_SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B';
		String position = "과장";
		
		switch(position) {
		case "부장":
			System.out.println("부장 입니다.");
			break;
		case "과장":
			System.out.println("과장 입니다.");
			break;
		default:
			System.out.println("손님 입니다.");
			break;
		}
	}

}
