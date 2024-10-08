package practice.ResponseValidation;

class AccountBal
{
	int accountNum;
	String cuntry; 
	String accountType;
	private AccountBal() {
		
	}
	public AccountBal(int accountNum, String cuntry, String accountType) {
		super();
		this.accountNum = accountNum;
		this.cuntry = cuntry;
		this.accountType = accountType;
	}
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	public String getCuntry() {
		return cuntry;
	}
	public void setCuntry(String cuntry) {
		this.cuntry = cuntry;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
}
