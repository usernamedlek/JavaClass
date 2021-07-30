package NHBank;

public class NHClient {
	
	private String accountNo;
	private int clientNo;
	private String cName;
	private int balance;
	
	
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getClientNo() {
		return clientNo;
	}
	public void setClientNo(int clientNo) {
		this.clientNo = clientNo;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	@Override
	public String toString() {
		return "NHClient [accountNo=" + accountNo + ", clientNo=" + clientNo + ", cName=" + cName + ", balance="
				+ balance + "]";
	}
	
	
	
	public NHClient() {
		super();
	}
	
	
	
	public NHClient(String accountNo, int clientNo, String cName, int balance) {
		super();
		this.accountNo = accountNo;
		this.clientNo = clientNo;
		this.cName = cName;
		this.balance = balance;
	}
	
	
	
	
	
	
	

}
