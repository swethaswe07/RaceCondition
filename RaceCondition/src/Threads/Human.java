package Threads;

public class Human extends  Thread{
	public void run() {
	
	

		try {
			System.out.println(Thread.currentThread().getName()+" has entered the bathroom");
			Thread.sleep(200);
			System.out.println(Thread.currentThread().getName()+" is using the bathroom");
			Thread.sleep(200);
			System.out.println(Thread.currentThread().getName()+" is fininshed the bathroom");
		
			
			
			
		}
		catch(InterruptedException e2) {
			e2.printStackTrace();
		}
}
}
	