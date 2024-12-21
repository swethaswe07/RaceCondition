package Threads;

public class EvenOddStart {
	public static void main(String args[]) throws InterruptedException{
		try {
			EvenOddT e1=new  EvenOddT();
		    EvenOddT e2=new  EvenOddT();
			
		    Thread t1=new Thread(e1);
		    Thread t2=new Thread(e2);
			t1.setName("Even");
			t2.setName("odd");
			
			
			t1.start();
			t1.join();
			t2.start();
			t2.join();
			
		}
		catch(InterruptedException e2) {
			e2.printStackTrace();
		}
	}
}



