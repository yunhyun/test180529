package java_example_180521;

public class Ch5_12_ArrayExercise {

	public static void main(String[] args) {
		/*
		 * 2차원 배열을 사용하여 평점 계산하기 
		 */
		double score[][]= {{3.3, 3.4},
							{3.5, 3.8},
							{4.2, 4.3},
							{3.9, 4.0}};
		double sum=0;
		int count=0;
		//score.length : score 배열의 행의 길이=4
		//score[0].length : score 배열의 1행의 열길이=2
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				System.out.println(score[i][j]);
				sum = sum + score[i][j];
				count++;
			}
		}
		double avg = sum/count;
		System.out.println("전체 평균은 : " + avg);

			
		}
	}
	



