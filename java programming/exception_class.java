
import java.util.Scanner;

/**
 * exception_class
 */
class myexception extends Exception{
    public String toString(){
        return "It is a exception";
    }
    public String getMessage(){
        return "It is a message";
    }
}
public class exception_class {
public static void main(String[] args)  {
    int a;
     Scanner sc=new Scanner(System.in);
     a=sc.nextInt();
     if(a<100){
        try {
            throw new myexception();
        } catch (Exception e) {
           System.out.println(e.toString()); 
           System.out.println(e.getMessage());
            System.out.println(e); // default toString() method run 
           e.printStackTrace();
        }
        }
        else{
            System.out.println("Program run with no exception");
        }
     
}
    
}