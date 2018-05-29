/*package java_example_180525;

import java.util.Scanner;

public class Ch6_26_Exercise20 {
	Scanner scanner = new Scanner(System.in);
	
	private String ano;
	private String owner;
	private int balance;
	
	public Ch6_26_Exercise20(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() { return ano; }
	public void setAno(String ano) { this.ano = ano; }
	public String getOwner() { return owner; }
	public void setOwner(String owner) { this.owner = owner; }
	public int getBalance() { return balance; }
	public void setBalance(int balance) { this.balance = balance; }
	
	//계좌생성하기
	public void createAccount() {
		System.out.println("--------------");
		System.out.println("계좌생성");
		System.out.println("--------------");
		
		System.out.print("계좌번호: "); 
		String ano = scanner.next();
		
		System.out.print("계좌주: "); 
		String owner = scanner.next();
		
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		
		Ch6_25_Exercise20 newAccount = new Ch6_25_Exercise20(ano, owner, balance);
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	//계좌목록보기
	private static void accountList() {
		System.out.println("--------------");
		System.out.println("계좌목록");
		System.out.println("--------------");
		for(int i=0; i<accountArray.length; i++) {
			Ch6_25_Exercise20 account = accountArray[i];
			if(account != null) {
				System.out.print(account.getAno());
				System.out.print("     ");
				System.out.print(account.getOwner());
				System.out.print("     ");
				System.out.print(account.getBalance());
				System.out.println();
			}
		}
	}
	
	//예금하기
	private static void deposit() {
		System.out.println("--------------");
		System.out.println("예금");
		System.out.println("--------------");
		System.out.print("계좌번호: "); 
		String ano = scanner.next();
		System.out.print("예금액: ");
		int money = scanner.nextInt();
		Ch6_25_Exercise20 account = findAccount(ano);
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("결과: 예금이 성공되었습니다.");
	}
	
	//출금하기
	public void withdraw() {
		System.out.println("--------------");
		System.out.println("출금");
		System.out.println("--------------");
		System.out.print("계좌번호: "); 
		String ano = scanner.next();
		System.out.print("출금액: ");
		int money = scanner.nextInt();
		Ch6_25_Exercise20 account = findAccount(ano);
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("결과: 출금이 성공되었습니다.");
	}	
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	public Ch6_25_Exercise20 findAccount(String ano) {
		Ch6_25_Exercise20 account = null;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();
				if(dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	
	
	
}
*/