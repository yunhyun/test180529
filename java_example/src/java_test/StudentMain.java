package java_test;

import java.util.Arrays;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student[] stuArray = new Student[100];
		boolean run = true;
		
		while(run) {
			System.out.println("하고 싶은 업무 선택 ");
			System.out.println("1.이름 및 점수 등록 || 2.학생목록보기");
			System.out.println("3.분석 || 4.종료");
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
				
				Student stu = new Student(name, koreanScore, englishScore, mathScore);
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
					Student student = stuArray[i];
					if(student!=null) {
						System.out.println(student.getName());
						System.out.println(student.getKoreanScore());
						System.out.println(student.getEnglishScore());
						System.out.println(student.getMathScore());
					}
				}
			case 3:
				
				Student max=null;
				for(int i=0;i<stuArray.length;i++) {
					Student student = stuArray[i];
					if(student.sumScore()>max.sumScore()) {
						max=student;
					} else {
						max=max;
					} 
				break;
				}
				System.out.println("최고 점수 이름은 : "+max.getName());
				System.out.println("최고 점수는 : "+max.sumScore());
			
			
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
