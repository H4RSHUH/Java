// if a class has only abstract methods, then we can declare an interface 
// here there is no need to mention public abstract menthod because by default all the methods of interface are public and abstract.



// class - class -> extends
// class - interface -> implements
// interface - interface -> extends
interface A{

    int age = 10; // by default it is static and final
    void show();
    void config();
}
interface D{
    void display();
}

interface C extends D{

}

class B implements A, C{
    public void show(){
        System.out.println("show method");
    }
    public void config(){
        System.out.println("config method");
    }

    public void display(){
        System.out.println("display method");
    }
}




// interface are also used for loose coupling 

interface Computer{
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Coding in Laptop");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Coding in Desktop");
    }
}

class Developer{
    void develop(Computer c){
        c.code();
    }
}

public class Interfaces {

    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();
        obj.display(); // This line will cause a compile-time error because the reference type A does not have the display() method. To call display(), you need to use a reference of type C or B.


        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer dev = new Developer();
        dev.develop(lap);
        dev.develop(desk);

    }

}
