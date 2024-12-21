package Threads;

public class MSOffice extends Thread {
	public void Typing() {
		try {
			for(int i=0;i<5;i++) { 
				System.out.println("Typing");
				Thread.sleep(200);
			}
			
		}
		catch(InterruptedException e1) {
			e1.printStackTrace();
		}

		
	}
	public void SpellCheck() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("SpellChecking");
				Thread.sleep(200);
			}
			
		}
		catch(InterruptedException e2) {
			e2.printStackTrace();
		}

	}
		
		
	public void Savings() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("Savings");
				Thread.sleep(200);
			}
			
		}
		catch(InterruptedException e1) {
			e1.printStackTrace();
		}


    }
	public void run() {
	try {
		if(Thread.currentThread().getName().equals("Typing")) {
			Typing();
		}
		else if(Thread.currentThread().getName().equals("SpellCheck")) {
			SpellCheck();
		}
		else {
			Savings();
			
		}
	}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
	}

