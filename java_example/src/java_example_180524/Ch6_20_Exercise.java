package java_example_180524;
//간단한 통장 예제 
public class Ch6_20_Exercise {
	private String ownerName;
	private int accountNumber;
	private int balance;
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int amount){
		this.balance=this.balance+amount;
	}
	
	public void withdraw(int amount){
		this.balance=this.balance-amount;
	}
	
	public void result(){
		System.out.println("예금주 이름 : "+ getOwnerName());
		System.out.println("계좌번호 : "+ getAccountNumber());
		System.out.println("잔고 : "+ getBalance());
	}
	
	
	
	
	
	
	
	   
	   
}
