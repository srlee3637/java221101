package naver.srlee3637.exercise;

public class Account {
	
	private int balance;
	
	public Account() {
		super();
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance += balance;
		if(this.balance > 1000000) {
			this.balance -= balance;
			System.out.println("100만 이하만 가능합니다.");
		}else if(this.balance < 0) {
			this.balance += balance;
			System.out.println("0 이상만 가능합니다.");
		}
	}
	
	
}
