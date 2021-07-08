package semaphore;

import java.util.concurrent.*;

public class App 
{
    public static void main(String args[]) throws InterruptedException 
    {
        Semaphore sem = new Semaphore(1);
        FooThread mt1 = new FooThread(sem, "A");
        FooThread mt2 = new FooThread(sem, "B");
        mt1.start();
        mt2.start();
        mt1.join();
        mt2.join();
        System.out.println("count: " + Shared.count);
    }
}