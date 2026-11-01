class A extends Thread{
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
class B extends Thread{
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
        A objA = new A();
        B objB = new B();

        // System.out.println(objA.getPriority());
        // 1 means lowest 10 means highest
        // objA.setPriority(9);
        // objA.setPriority(Thread.MAX_PRIORITY);
        objA.start();
        objB.start();

    }
}
