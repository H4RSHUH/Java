import java.util.Scanner;

public class Input {
    public static void main(String args[]){
        System.out.println("Enter a number");
        // int num;
        // try{
        //     // System.in.read return integer value which means whatever you type it will give the ASCII value of it
        //     num = System.in.read();
        //     System.out.println(num);
        // }catch(Exception e){
        //     System.out.println(e);
        // }

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("You entered: " + num);
    }
}
