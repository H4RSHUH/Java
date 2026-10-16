public class Boxing {
    public static void main(String args[]){

        int a = 10;
        // Autoboxing: converting primitive type to wrapper class object
        Integer num = a; 

        System.out.println(num);

        // Unboxing: converting wrapper class object to primitive type
        int b = num;
        System.out.println(b);

        String str = "123";
        // Converting String to Integer using parseInt method
        int c = Integer.parseInt(str);
        System.out.println(c * 4);
    }
}
