 package Threads;
 class Begin{

public static void main(String[] args) {
        Object lock = new Object();
       int maxLimit = 10;

        Thread evenThread = new Thread(new EvenOddR(lock, maxLimit), "Even");
        Thread oddThread = new Thread(new EvenOddR(lock, maxLimit), "Odd");

        evenThread.start();
        oddThread.start();
    }}