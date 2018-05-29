package java_example_180521;

import java.util.Scanner;

public class Ch5_13_ArrayExercise {

	public static void main(String[] args) {
		String[][] words= {
				{"chair","의자"},
				{"desk","책상"},
				{"water","물"},
				{"monitor","모니터"},
				{"mouse","마우스"}};
		int score=0;
		
		Scanner scan = new Scanner(System.in);
		//System.out.println(words.length);
		
		for(int i=0;i<words.length;i++) {
			System.out.print("문제"+(i+1)+". "+words[i][0]+"의 뜻은 무엇인가요? ");
			String answer=scan.nextLine();
			
			if(answer.equals(words[i][1])) {
				System.out.println("정답입니다.");
				score++;
			} else {
				System.out.println("틀렸습니다.");
				System.out.println("정답은 "+words[i][1]+"입니다.");
			}
		}
		System.out.println("총 "+score+"개를 맞췄습니다. ");
		double percent=100*((double)score/words.length);
		System.out.println("정답률은 "+percent+"% 입니다.");
		
	}

}










