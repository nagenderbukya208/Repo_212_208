package task_1_task2;


	
	import java.util.List;
	import java.util.Date;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

class Values {
	   List<User1> user;
	   List<Manager1> manager;
	   String pinName;
	   private Values() {}
	    public Values(List<User1> user, List<Manager1> manager, String pinName) {
		super();
		this.user = user;
		this.manager = manager;
		this.pinName = pinName;
		
	}
		
		public void setUser(List<User1> user) {
	        this.user = user;
	    }
	    public List<User1> getUser() {
	        return user;
	    }    
	    public void setManager(List<Manager1> manager) {
	        this.manager = manager;
	    }
	    public List<Manager1> getManager() {
	        return manager;
	    }	    
	    public void setPinName(String pinName) {
	        this.pinName = pinName;
	    }
	    public String getPinName() {
	        return pinName;
	    }    
	}

