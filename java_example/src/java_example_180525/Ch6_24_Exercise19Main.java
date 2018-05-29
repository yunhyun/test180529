package java_example_180525;

public class Ch6_24_Exercise19Main {

	public static void main(String[] args) {
		Ch6_24_Exercise19 account = new Ch6_24_Exercise19();
		
		account.setBalance(10000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고: " + account.getBalance());		
	}

}
