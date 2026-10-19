// Enums are named constants

enum Status{
    Running, Failed, Pending, Success;
}


enum Laptop{
    Macbook(1500), Iphone, Dell(1200), HP(1000), Lenovo(1300);

    // As Iphone is not initialized, it will call the default constructor which will set the price to 100 or any other default value you choose. You can also provide a default price for all laptops if you want.
    private Laptop() {
        price = 100;
    }

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    
    
}


public class Enums {
    public Enums() {
    }

    public static void main(String[] args) {
        Laptop l = Laptop.Macbook;
        System.out.println(l + " $" + l.getPrice());



        Status s = Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal());// kind of index

        if(s == Status.Running){
            System.out.println("All good");
        }else if(s == Status.Failed){
            System.out.println("try again");
        }else if(s == Status.Pending){
            System.out.println("Please wait");
        }else if(s == Status.Success){
            System.out.println("Ok done....!!!");
        }
        Status[] arr = Status.values();
        for(Status st : arr)
            System.out.println(st + " " + st.ordinal());


        switch(s){
            case Running:
                System.out.println("All good");
                break;
            case Failed:
                System.out.println("try again");
                break;
            case Pending:
                System.out.println("Please wait");
                break;
            case Success:
                System.out.println("Ok done....!!!");
                break;
        }
    }
}
