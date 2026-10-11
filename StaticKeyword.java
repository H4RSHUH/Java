class Mobile{
    String brand;
    int price;
    // Static keyword make the members as a part of class not the object
    static String name;

    // static block makes this block implement only once rather then assigning it on every object creation like constructor 
    static{
        name = "Phone";
    }

    void show(){
        System.out.println(brand + ": " + price + " " + name);
    }
}

class A{
    void show(){
        System.out.println("A called");
    }
}

public class StaticKeyword {
    public static void main(String args[]){
        // this m is not an object it is a refernce variable which is referring to the object
        Mobile m = new Mobile();
        m.brand = "Apple";
        m.price = 1234;
        m.show();

        Mobile n; // reference creation
        n = new Mobile(); // assigning the object to referance variable
        n.brand = "Samsung";
        n.price = 65432;
        n.show();

        // Anonymous object
        new A().show();
        

    }
}
