// Upcasting: The process of converting a reference of a subclass to a reference of its superclass.
// Downcasting: The process of converting a reference of a superclass to a reference of its subclass. It requires explicit casting and can lead to a ClassCastException if the object being cast is not an instance of the subclass.


class A {
    void show() {
        System.out.println("A class display method");
    }
}
class B extends A {
    void show1() {
        System.out.println("B class display method");
    }
}
public class Casting {
    public static void main(String[] args){
        
        A obj1 = new B(); // Upcasting: B is a subclass of A, so we can assign a B object to an A reference
        obj1.show();

        // Downcasting: We need to explicitly cast the A reference back to a B reference
        B obj2 = (B) obj1; // This is safe because obj1 actually refers to a B object
        obj2.show1(); 

    }
}
