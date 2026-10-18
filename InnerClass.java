class OuterClass {
    void show(){
        System.out.println("Outer class method");
    }

    class Inner {
        void display(){
            System.out.println("Inner class method");
        }
    }
}

class A{
    void show(){
        System.out.println("Outer class method");
    }
    // we can only make inner class static not the outer class.
    // If the class is static then there is no need to create object of outer class to create object of inner class.
    static class B {
        void display(){
            System.out.println("Inner class method");
        }
    }
}

public class InnerClass {
    public static void main(String args[]){

        OuterClass obj = new OuterClass();
        obj.show();
        // To create object of inner class we need to create object of outer class first.
        OuterClass.Inner in = obj.new Inner();
        in.display();


        // If we make inner class as static then we can create object of inner class without creating object of outer class.
        A obj1 = new A();
        obj1.show();
        A.B obj2 = new A.B();
        obj2.display();
    }
}
