package Threads;

public class EvenOddT extends Thread{
		public void Even() {
			try {
				for(int i=1;i<=10;i++) { 
					if(i%2==0) {
						System.out.println(i+" is even");
					Thread.sleep(200);
				}
				}
			}
			catch(InterruptedException e1) {
				e1.printStackTrace();
			}

			
		}
		public void odd() {
			try {
				for(int i=1;i<=10;i++) { 
					if(i%2!=0) {
						System.out.println(i+" is odd");
					Thread.sleep(200);
				}	
				}
			}
			catch(InterruptedException e2) {
				e2.printStackTrace();
			}

		}
			
			
		

	    
		public void run() {
		try {
			if(Thread.currentThread().getName().equals("Even")) {
				Even();
			
			}
			else {
				odd();
				
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}

		}
		}



