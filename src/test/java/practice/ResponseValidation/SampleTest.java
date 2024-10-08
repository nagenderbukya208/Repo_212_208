package practice.ResponseValidation;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

class Bank 
{
	String balanceDate;
	List<AccountBal> accountBal;
	private Bank() {}
	
	public Bank(String balanceDate, List<AccountBal> accountBal) {
		
		this.balanceDate = balanceDate;
		this.accountBal = accountBal;
	}
	public String getBalanceDate() {
		return balanceDate;
	}
	public void setBalanceDate(String balanceDate) {
		this.balanceDate = balanceDate;
	}
	public List<AccountBal> getAccountBal() {
		return accountBal;
	}
	public void setAccountBal(List<AccountBal> accountBal) {
		this.accountBal = accountBal;
	}
}

public class SampleTest {
public static void main(String[] args) throws Throwable, DatabindException, IOException {
	List<AccountBal> bale= new ArrayList<AccountBal>();
	bale.add(new AccountBal(1234567, "India", "CA"));
	Bank b= new Bank("2024-10-11", bale);
	ObjectMapper om= new ObjectMapper();
	om.writeValue(new File("./task1.json"), b);
	
	System.out.println("Done");
	
}
}
