package java_example_180524;

public class Ch6_18_ExerciseMain {

	public static void main(String[] args) {
		Ch6_18_Exercise stud1 = new Ch6_18_Exercise("선남",91,84);
		/*stud1.name = "선남"; //이름
		stud1.assignmentScore = 91; //과제점수
		stud1.examScore = 84; //시험점수
*/		//System.out.println(stud1.toString( ));
		stud1.result();

		Ch6_18_Exercise stud2 = new Ch6_18_Exercise( );
		stud2.name = "선녀"; 
		stud2.assignmentScore = 86;
		stud2.examScore = 95;
		stud2.result();
	}

}
