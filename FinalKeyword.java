// As a variable : If any variable is declared as final, then it value cann't be changed, (like const in c++)

// As a method : If any method is declared as final, then it cann't be overridden by the subclass

// As a class : If any class is declared as final, then it cann't be inherited by any other class
class A{
    final void show(){
        System.out.println("A class display method");
    }
}


// It is not possible to override final method in subclass, so the below code will give compile time error

final class B extends A{
    //  void show(){
    //     System.out.println("B class display method");
    // }

    void display(){
        System.out.println("B class display method");
    }
}

// It is not possible to inherit from a final class, so the below code will give compile time error
// class C extends B{
//      void display(){
//         System.out.println("C class display method");
//     }
// }




public class FinalKeyword {

    public static void main(String[] args) {
        final int num = 0;
        // num = 9; // This will cause a compile-time error
        System.out.println(num);

        B b = new B();
        b.show();
        b.display();
    }

}
