package Threads;

public class HumanStart {
	public static void main(String args[]) throws InterruptedException{
		try {
			Human H1=new Human();
			Human H2=new Human();
			Human H3=new Human();
			Thread t1=new Thread( H1);
			Thread t2=new Thread(H2);
			Thread t3=new Thread(H3);
			t1.setName("Boy");
			t2.setName("Girl");
			t3.setName("Other");
			
			t1.start();
			t1.join();
			t2.start();
			t2.join();
			t3.start();
			t3.join();
		}
		catch(InterruptedException e2) {
			e2.printStackTrace();
		}
	}
}
