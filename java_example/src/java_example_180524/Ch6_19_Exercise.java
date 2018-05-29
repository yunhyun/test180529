package java_example_180524;
//앞의 예제를 getter, setter 메소드를 이용하여 만들어보기 
public class Ch6_19_Exercise {
	//필드 
	private String name;
	private int assignmentScore;
	private int examScore;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAssignmentScore() {
		return assignmentScore;
	}
	public void setAssignmentScore(int assignmentScore) {
		this.assignmentScore = assignmentScore;
	}
	public int getExamScore() {
		return examScore;
	}
	public void setExamScore(int examScore) {
		this.examScore = examScore;
	}
	
	public void result() {
		System.out.println("이름 : " + getName());
		System.out.println("과제 점수 : " + getAssignmentScore());
		System.out.println("시험 점수 : " + getExamScore());
		//System.out.println("학점 : " + getGrade());
	}
	
	
}
