package Threads;

public class EvenR implements Runnable {
   int count = 1; 
   
   Object obj;
    
    
	public EvenR ( Object obj) {
    	super();
    this.obj=obj;
	}
    @Override
    public void run() {
        while (count <= 10) {
           
               
                   
                    if (count % 2 == 0 && Thread.currentThread().getName().equals("Even")&& count<=10) {
                    	 synchronized (obj) {
                        System.out.println("Thread Name: " + Thread.currentThread().getName() + " Value: " + count);
                    	 
                        try{
                        	Thread.sleep(200);
                        
                        }catch(InterruptedException e) {
                        	e.printStackTrace();
                     
                        }
                        count++;
                        try {
                        obj.wait();
                       
                    }catch(InterruptedException e) {
                    	e.printStackTrace();
                    }
                    }
                    }
                   
                    if (count % 2 != 0 && Thread.currentThread().getName().equals("Odd")&& count<=10) {
                    	 synchronized (obj) {
                        System.out.println("Thread Name: " + Thread.currentThread().getName() + " Value: " + count);
                    	 
                        try {
                        	Thread.sleep(200);
                        	
                        }catch(InterruptedException e1) {
                        	e1.printStackTrace();
                        }
                        count++;
                        try {
                       
                        obj.notify(); 
                    }
                    catch(Exception e) {
                    	e.printStackTrace();
                    }
                    
                    }
                    }  
                    }
    }
}
