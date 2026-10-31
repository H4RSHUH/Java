
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
            // This will not be executed in our case as we are throwing an exception before this line. 
            // So for the code we want to run always we can use finally block.
            System.out.println("Byee...");
        }catch(ArithmeticException e){
            System.out.println("Default Output" + e);
        }catch(MyException e){
            System.out.println("There is an error" + e);
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("Byee...");
        }
    }
}
