package practice.ResponseValidation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static io.restassured.RestAssured.*;
public class SampleTest2 {
public static void main(String[] args) throws Throwable, Throwable, IOException {
 ObjectMapper objm= new ObjectMapper();
Bank value = objm.readValue(new File("./task1.json"),Bank .class);
 System.out.println(value.getBalanceDate());
 List<AccountBal> accountBal = value.getAccountBal();
  for (AccountBal accBal : accountBal) {
	
	System.out.println(accBal.getAccountNum());
	System.out.println(accBal.getAccountType());
	System.out.println(accBal.cuntry);
	
}
 

}
}
