
class MyException extends Exception{
    public MyException(String msg){
        super(msg);
    }
}

public class ExceptionHandling {
    public static void main(String args[]){
        int i = 20;
        int j = 0;
        try{
            j = 18/ i;
            // if(j == 0)throw new ArithmeticException("J dont want to be 0");
            if(j == 0)throw new MyException("J dont want to be 0");

        }catch(ArithmeticException e){
            System.out.println("Default Output" + e);
        }catch(MyException e){
            System.out.println("There is an error" + e);
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
    }
}
