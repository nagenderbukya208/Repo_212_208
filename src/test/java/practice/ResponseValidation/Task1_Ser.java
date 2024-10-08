package practice.ResponseValidation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

class ParentPOJOClass {
	   List<Value> value;
	   String itemconfigId;

	   public ParentPOJOClass()
	   {
		   
	   }
	   
	    public ParentPOJOClass(List<Value> value, String itemconfigId) {
		
		this.value = value;
		this.itemconfigId = itemconfigId;
	    }
		public void setValue(List<Value> value) {
	        this.value = value;
	    }
	    public List<Value> getValue() {
	        return value;
	    }
	    
	    public void setItemconfigId(String itemconfigId) {
	        this.itemconfigId = itemconfigId;
	    }
	    public String getItemconfigId() {
	        return itemconfigId;
	    }
	    
	}

   class User {

	   int id;
	   String value;

	   public User()
	   {
		   
	   }
	   
	    public User(int id, String value) {
		
		this.id = id;
		this.value = value;
	    }
		public User(int i) {
			
		}

		public void setId(int id) {
	        this.id = id;
	    }
	    public int getId() {
	        return id;
	    }
	    
	    public void setValue(String value) {
	        this.value = value;
	    }
	    public String getValue() {
	        return value;
	    }
	    
	}

   class Manager {	   
 	   int id;
 	   String value;
 	   
 	   public Manager()
 	   {
 		   
 	   }
 	    public Manager(int id, String value) {
			super();
			this.id = id;
			this.value = value;
		}
			public void setId(int id) {
 	        this.id = id;
 	    }
 	    public int getId() {
 	        return id;
 	    }
 	    
 	    public void setValue(String value) {
 	        this.value = value;
 	    }
 	    public String getValue() {
 	        return value;
 	    }
 	    
 	}


   class Value {

 	  
 	   List<User> user;
 	   List<Manager> manager;
 	   String pinname;
 	   public Value()
 	   {		   
 	   }
 	    public Value(List<User> user, List<Manager> manager, String pinname) {
			super();
			this.user = user;
			this.manager = manager;
			this.pinname = pinname;
		}
			public void setUser(List<User> user) {
 	        this.user = user;
 	    }
 	    public List<User> getUser() {
 	        return user;
 	    }    
 	    public void setManager(List<Manager> manager) {
 	        this.manager = manager;
 	    }
 	    public List<Manager> getManager() {
 	        return manager;
 	    }    
 	    public void setPinname(String pinname) {
 	        this.pinname = pinname;
 	    }
 	    public String getPinname() {
 	        return pinname;
 	    }
 	  }
public class Task1_Ser {
	public static void main(String[] args) throws Throwable, DatabindException, IOException {
		List<User> list1=new ArrayList<User>();
	    list1.add(new User(12345, "jerry"));
	
		List<Manager> list2=new ArrayList<Manager>();
		list2.add(new Manager(123123, "Nag"));
	
		List<Value> list3=new ArrayList<Value>();
		list3.add(new Value(list1, list2, "208212"));
	
		ParentPOJOClass pobj= new ParentPOJOClass(list3, "itemconfidId#1234");
		ObjectMapper om=new ObjectMapper();
		om.writerWithDefaultPrettyPrinter().writeValue(new File("./Charan.json"), pobj);
		//om.writeValue(new File("./Charan.json"), pobj);
		System.out.println("===DONE==");

	}

}
