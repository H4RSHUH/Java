// functional interface is an interface that has only one abstract method. It is also known as Single Abstract Method (SAM) interface. It can have any number of default methods, static methods, and private methods. The main purpose of functional interfaces is to provide a target type for lambda expressions and method references.

@FunctionalInterface 
interface A{
    int add(int a, int b);
    // void show(int a);
}

// class B implements A{
//     public void show(int a){
//         System.out.println("Hello: " + a);
//     }
// }


// Lamda Expressions can work only with functional interfaces.

public class FuncInterface {
    public static void main(String[] args) {
        // A a = new B();
        // a.show(5);



        // A a2 = new A() {
        //     public void show(int b) {
        //         System.out.println("Hello from anonymous class: " + b);
        //     }
        // };
        // a2.show(5);
        // // All these 3 works the same way. The first one is the simple one, the second we remove the type of parameter as it can be inferred from the functional interface, and the third one we remove the parenthesis as there is only one parameter.
        // // A a1 = (int a) -> System.out.println("Hello from lambda: " + a);
        // // A a1 = (a) -> System.out.println("Hello from lambda: " + a);
        // A a1 = a -> System.out.println("Hello from lambda: " + a);
        // a1.show(10);



        A a3 = new A() {
            public int add(int a, int b) {
                return a + b;
            }
        };
        int result1 = a3.add(5, 10);
        System.out.println("Result from anonymous class: " + result1);

        A a4 = (int a, int b) -> {
            return a + b;
        };
        int result2 = a4.add(5, 10);
        System.out.println("Result from lambda expression: " + result2);

        A a5 = (a, b) -> a + b;
        int result3 = a5.add(5, 10);
        System.out.println("Result from lambda expression with inferred types: " + result3);
    }
}
