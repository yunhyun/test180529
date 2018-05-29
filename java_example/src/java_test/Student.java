package java_test;

public class Student {
	private String name;
	private int koreanScore;
	private int englishScore;
	private int mathScore;
	private String rank;
	
	public Student(String name, int koreanScore, int englishScore, int mathScore) {
		this.name = name;
		this.koreanScore = koreanScore;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKoreanScore() {
		return koreanScore;
	}
	public void setKoreanScore(int koreanScore) {
		this.koreanScore = koreanScore;
	}
	public int getEnglishScore() {
		return englishScore;
	}
	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public int sumScore() {
		int sum = getKoreanScore()+getEnglishScore()+getMathScore();
		return sum;
	}
	
	public double avgScore() {
		double avg = sumScore()/3;
		return avg;
	}
}
