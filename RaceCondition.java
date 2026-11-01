class Counter{
    int cnt;
    // It will let only one thread to call the method at a tym
    public synchronized void increment(){
        cnt++;
    }
}

public class RaceCondition {
    public static void main(String args[]) throws InterruptedException{

        Counter c = new Counter();
    
        Runnable obj1 = () -> {
            for(int i = 0; i < 1000; i++)c.increment();
        };
        Runnable obj2 = () -> {
            for(int i = 0; i < 1000; i++)c.increment();
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
    
        t1.start();
        t2.start();

        // it waits for both the threads to complete their task and let them comeback
        t1.join();
        t2.join();

        System.out.println(c.cnt);
    }
}
