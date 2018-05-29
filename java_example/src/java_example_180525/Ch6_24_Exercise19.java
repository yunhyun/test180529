package java_example_180525;

//확인문제 19번 
public class Ch6_24_Exercise19 {
	//상수 선언 
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	//필드 선언 
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		//0<=balance<=1000000
		/*if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
		this.balance = balance;
		} else {
			return;
		}*/
		if(balance < MIN_BALANCE || balance>MAX_BALANCE) {
			return;
		} else {
			this.balance=balance;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
