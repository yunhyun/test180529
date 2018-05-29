package java_example_180525;
import java.util.Scanner;

public class Ch6_21_StudentMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ch6_21_Student[] stuArray = new Ch6_21_Student[100];
		boolean run = true;
		
		while(run) {
			System.out.println("하고 싶은 업무 선택 ");
			System.out.println("1.이름 및 점수 등록 || 2.학생목록보기");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.print("학생이름 : ");
				String name = scan.next();
				System.out.print("국어점수 : ");
				int koreanScore = scan.nextInt();
				System.out.print("영어점수 : ");
				int englishScore = scan.nextInt();
				System.out.print("수학점수 : ");
				int mathScore = scan.nextInt();
				
				Ch6_21_Student stu = new Ch6_21_Student(name, koreanScore, englishScore, mathScore);
				for(int i=0;i<stuArray.length;i++) {
					if(stuArray[i]==null) {
						stuArray[i]=stu;
						System.out.println("등록완료");
						break;
					}
				}
				break;
			case 2:
				for(int i=0;i<stuArray.length;i++) {
					Ch6_21_Student student = stuArray[i];
					if(student!=null) {
						System.out.println(student.getName());
						System.out.println(student.getKoreanScore());
						System.out.println(student.getEnglishScore());
						System.out.println(student.getMathScore());
					}
				}
				System.out.println("");
			
			
		}
		
		
		
		
		/*String name1 = scan.next();
		int koreanScore1 = scan.nextInt();
		int englishScore1 = scan.nextInt();
		int mathScore1 = scan.nextInt();
		Ch6_21_Student stu1 = new Ch6_21_Student(name1, koreanScore1, englishScore1, mathScore1);
		
		String name2 = scan.next();
		int koreanScore2 = scan.nextInt();
		int englishScore2 = scan.nextInt();
		int mathScore2 = scan.nextInt();
		Ch6_21_Student stu2 = new Ch6_21_Student(name2, koreanScore2, englishScore2, mathScore2);

		String name3 = scan.next();
		int koreanScore3 = scan.nextInt();
		int englishScore3 = scan.nextInt();
		int mathScore3 = scan.nextInt();
		
		Ch6_21_Student stu3 = new Ch6_21_Student(name3, koreanScore3, englishScore3, mathScore3);
		
		
		if(stu1.sumScore()>stu2.sumScore() && stu1.sumScore()>stu3.sumScore()) {
			stu1.setRank("1등");
		} else if(stu1.sumScore()>stu2.sumScore() && stu2.sumScore()>stu3.sumScore()) {
			stu2.setRank("2등");
		} else {
			stu3.setRank("3등");
		}
		System.out.println(stu1.sumScore());
		System.out.println(stu2.sumScore());
		System.out.println(stu3.sumScore());
		
		System.out.println(stu1.getName()+"학생의 평균 점수 : " + stu1.avgScore());
		System.out.println(stu1.getName()+"학생의 등수 : " + stu1.getRank());
		System.out.println(stu2.getName()+"학생의 평균 점수 : " + stu2.avgScore());
		System.out.println(stu2.getName()+"학생의 등수 : " + stu2.getRank());
		System.out.println(stu3.getName()+"학생의 평균 점수 : " + stu3.avgScore());
		System.out.println(stu3.getName()+"학생의 등수 : " + stu3.getRank());*/

	}
	

}
}
