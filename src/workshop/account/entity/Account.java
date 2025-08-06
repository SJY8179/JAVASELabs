package workshop.account.entity;

public class Account {
	private String custId;
	private String acctId;
	private int balance;
	
	//default constructor선언 
	public Account() {
		System.out.println("기본생성자 호출됨");
	}
	
	//Constructor Overloading (생성자 중복정의)
	public Account(String custId, String acctId, int balance) {
		super();
		this.custId = custId;
		this.acctId = acctId;
		this.balance = balance;
	}
	
	
	
	//public void setBalance(int Balance) {
			//this.balance = Balance;
//		}
	
	public int getBalance() {
		return balance;
	}
	

	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}
	//입금
	public void deposit(int amount) {
		this.balance += amount;
	}
	//출금 
	public void withdraw(int amount) {
		this.balance -= amount;
	}
}
