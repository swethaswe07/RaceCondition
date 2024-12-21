package Threads;

public class Queue {
	int data;
	public void put(int i) {
		data=i;
	     System.out.println("Data added...the data value is: "+i);
		}
		public void get(int i) {
			data=i;
			System.out.println("Data retriver...the data value is: "+data);
			
		
	}

}
