// Dynamic Method Dispatch in Java is a mechanism by which a call to an overridden method is resolved at runtime rather than compile-time.
// It allows Java to support polymorphism, enabling a subclass to provide a specific implementation of a method that is already defined in its superclass.


class A{
    void show(){
        System.out.println("A class display method");
    }
}

class B extends A{
    void show(){
        System.out.println("B class display method");
    }
}

class C extends A{
    void show(){
        System.out.println("C class display method");
    }
}

// As d does not extend A, it cannot be assigned to a reference of type A
// class D{

// }
public class DynamicMethodDispatch {

    public static void main(String[] args) {
        A obj = new A();
        obj.show(); // Output: A class display method

        obj = new B();
        obj.show(); // Output: B class display method

        obj = new C();
        obj.show(); // Output: C class display method

        // obj = new D(); // This will cause a compile-time error since D does not extend A
    }
}
