class A implements Runnable{
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("Hyyy");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class B implements Runnable{
    public void run(){
        for(int i = 0; i < 10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) { 
                e.printStackTrace();
            }
        }
    }
}

public class Threadss {
    public static void main(String a[]){
        Runnable objA = new A();
        Runnable objB = new B();

        // System.out.println(objA.getPriority());
        // 1 means lowest 10 means highest
        // objA.setPriority(9);
        // objA.setPriority(Thread.MAX_PRIORITY);
        Thread t1 = new Thread(objA);
        Thread t2 = new Thread(objB);
        t1.start();
        t2.start();

    }
}