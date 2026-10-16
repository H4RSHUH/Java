// Abstract methods are methods that are declared without an implementation.
// An abstract method can only be used in an abstract class, and it must be implemented by subclasses.
// Abstract classes cannot be instantiated directly, but they can be subclassed.
// you cant make object of abstract class but you can make reference of abstract class and assign it to object of subclass.

// it is not necessary that abstract class should have abstract methods.

// if you dont want to implement all the abstract methods of abstract class in subclass then you can make that subclass also abstract class.

// We can only create objects of concrete class

abstract class Car{
    public abstract void drive();

    public abstract void crabWalk();

    void playSong(){
        System.out.println("Playing....");
    }
}


abstract class WagonR extends Car{

    public void drive(){
        System.out.println("Driving");
    }
}

class Hummer extends WagonR{
    public void crabWalk(){
        System.out.println("Crab Walking");
    }
}
public class AbstractKeyword {
    public static void main(String args[]){

        Car obj = new Hummer();
        obj.drive();
        obj.crabWalk();
        obj.playSong();
    }
}
