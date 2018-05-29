package java_example_180524;

public class Ch6_18_Exercise {
	//필드 선언
	String name;
	int assignmentScore;
	int examScore;
	
	//생성자 선언 
	Ch6_18_Exercise(){
		
	}
	
	Ch6_18_Exercise(String name, int assignmentScore, int examScore){
		this.name=name;//"선남"
		this.assignmentScore=assignmentScore;//91
		this.examScore=examScore;//84
	}
	
	
	//result 메소드 선언 
	public void result() {
		System.out.println("이름 : " + this.name);
		System.out.println("과제 점수 : " + this.assignmentScore);
		System.out.println("시험 점수 : " + this.examScore);
		System.out.println("학점 : " + getGrade());
	}
	
	//학점 계산용 메소드 
	public String getGrade() {
		String grade;
		double avg;
		avg=(this.assignmentScore+this.examScore)/2;
		if(avg>=90) {
			grade="A";
		} else if(avg>=80) {
			grade="B";
		} else {
			grade="F";
		}
		return grade;
	}
}









