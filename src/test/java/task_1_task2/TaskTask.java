package task_1_task2;
	import java.io.File;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.List;
	import com.fasterxml.jackson.databind.ObjectMapper;
	class Self{		
		String href;
		public Self(String href) {
			super();
			this.href = href;
		}
		public String getHref() {
			return href;
		}
		public void setHref(String href) {
			this.href = href;
		}
}
	//**********************************************************************
	class Next{		
		String href;
		public Next(String href) {
			super();
			this.href = href;
		}
		public String getHref() {
			return href;
		}
		public void setHref(String href) {
			this.href = href;
		}		
	}
	//********************************************************************
	class Links{		
		Self self;
		Next next;		
		public Links()
		{		
		}
		public Links(Self self, Next next) {
			super();
			this.self = self;
			this.next = next;
		}
		public Self getSelf() {
			return self;
		}
		public void setSelf(Self self) {
			this.self = self;
		}
		public Next getNext() {
			return next;
		}
		public void setNext(Next next) {
			this.next = next;
		}	
	}
	  //*******************************************************************

	class Result
	{		
		int id;
		double total;
		int customerId;		
		public Result()
		{		
		}	
		public Result(int id, double total, int customerId) {
			super();
			this.id = id;
			this.total = total;
			this.customerId = customerId;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public double getTotal() {
			return total;
		}
		public void setTotal(double total) {
			this.total = total;
		}
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}	
	}
	//*************************************************************************
	class Orders
	{
		Links links;
		List<Result> result;		
		public Orders()
		{			
		}
		public Orders(Links links, List<Result> result) {
			super();
			this.links = links;
			this.result = result;
		}
		public Links getLinks() {
			return links;
		}
		public void setLinks(Links links) {
			this.links = links;
		}
		public List<Result> getResult() {
			return result;
		}
		public void setResult(List<Result> result) {
			this.result = result;
		}
	}
	//*************************************************************

	public class TaskTask {
		public static void main(String[] args) throws Throwable, Throwable, IOException {	
			Self s=new Self("/orders");
			Next n= new Next("/orders?page=2");		
			Links list1=new Links(s,n);
			List<Result> list2=new ArrayList<Result>();
			list2.add(new Result(7325,78.22,9001));
			list2.add(new Result(7236,301.97,9200));
		
			Orders or= new Orders(list1, list2);
			
			ObjectMapper om=new ObjectMapper();
			om.writerWithDefaultPrettyPrinter().writeValue(new File("./FileFile.json"), or);	
			System.out.println("DONE");
			}
	}

