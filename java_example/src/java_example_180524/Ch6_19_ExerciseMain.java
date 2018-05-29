package java_example_180524;

public class Ch6_19_ExerciseMain {

	public static void main(String[] args) {
		//Ch6_18_Exercise stud1 = new Ch6_18_Exercise("선남",91,84);
		Ch6_19_Exercise stud1 = new Ch6_19_Exercise();
		//setter를 이용한 필드값 할당 
		stud1.setName("선남");
		stud1.setAssignmentScore(91);
		stud1.setExamScore(84);
		
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


