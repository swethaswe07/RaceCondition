package Threads;

public class start {
	
	    public static void main(String[] args) throws InterruptedException{
	    	Object Lock=new Object();
	    	
	        EvenR e1 = new EvenR(Lock); 
	        EvenR e2 = new EvenR(Lock); 
	      

	        Thread t1 = new Thread(e1);
	        Thread t2 = new Thread(e2);

	        t1.setName("Even");
	        t2.setName("Odd");

	        t1.start();
	        
	        t2.start();
	        

	        //new Thread(e1,"Even").start();
	        //new Thread(e1,"Odd").start();
	        
	    }
	}


