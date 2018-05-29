package java_example_180528;

public class Ch7_02_StudentExample {

	public static void main(String[] args) {
		//Student 클래스에 대한 객체 생성 
		Ch7_02_Student student = 
				new Ch7_02_Student("이름","123456-1234567",10);
		
		//부모클래스의 필드 
		System.out.println(student.name);
		System.out.println(student.ssn);
		
		//자식클래스의 필드 
		System.out.println(student.studentNo);
		
		}

}
