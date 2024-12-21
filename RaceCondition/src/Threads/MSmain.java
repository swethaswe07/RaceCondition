package Threads;

public class MSmain{
	public static void main(String args[]) throws InterruptedException{
		MSOffice MS1=new MSOffice();
		MSOffice MS2=new MSOffice();
		MSOffice MS3=new MSOffice();
		Thread t1=new Thread( MS1);
		Thread t2=new Thread(MS2);
		Thread t3=new Thread(MS3);
		t1.setName("Typing");
		t2.setName("SpellCheck");
		t3.setName("Saving");
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		
	
		
	}

}
