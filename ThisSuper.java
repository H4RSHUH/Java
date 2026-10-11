// super is always present in the very first line of the constructor. It is used to call the constructor of the parent/super class.
// it is there if you dont even write it. It is there by default.
// If you want to call the constructor of the parent class with some parameters,
// then you can use super with parameters in the first line of the constructor of the child class.


// so now there is a que it makes sense for super for child class
// but what about parent class. WHy super is there
// It is because every class in java extends Object class(Even if you dont write it)



// Now came this()
// this is used to call constructor of  the same class

class A {
    A() {
        System.out.println("A class constructor");
    }
    A(int n) {
        System.out.println("A class constructor with parameter: " + n);
    }
}

class B extends A {
    B() {
        System.out.println("B class constructor");
    }
    B(int n){
        super(n);
        System.out.println("B class constructor with parameter: " + n);
    }
}
public class ThisSuper {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
