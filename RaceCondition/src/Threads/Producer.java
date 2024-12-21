package Threads;

public class Producer extends Thread {
	Queue a;
	public Producer(Queue q) {
		a=q;
		}
@Override
public void run() {
	int i=1;
	while(true) {
		a.put(i);
		i++;
	
	}
}
}
