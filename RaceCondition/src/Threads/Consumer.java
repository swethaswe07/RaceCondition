package Threads;

public class Consumer extends Thread {
Queue b;

public Consumer(Queue q) {
	b=q;
}
@Override
public void run() {
	int i=1;
	while(true) {
		b.get(i);
		i++;
	}
}
}
