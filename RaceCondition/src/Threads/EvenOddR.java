package Threads;

public class EvenOddR implements Runnable {
    private final Object obj;
    private final int limit;

    public EvenOddR(Object obj, int limit) {
        this.obj = obj;
        this.limit = limit;
    }

    @Override
    public void run() {
        for (int i = 1; i <= limit; i++) {
            synchronized (obj) {
                if ((i % 2 == 0 && Thread.currentThread().getName().equals("Even")) ||
                    (i % 2 != 0 && Thread.currentThread().getName().equals("Odd"))) {
                    System.out.println("Thread Name: " + Thread.currentThread().getName() + " Value: " + i);
                    obj.notify(); // Notify the other thread
                    try {
                        if (i < limit) { // Prevent waiting at the end
                            obj.wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }}}
        }
   
