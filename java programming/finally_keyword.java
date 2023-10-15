
import java.util.Scanner;

/**
 * finally
 */

public class finally_keyword {
    public static float divide(int a,int b){
  try {
    System.out.println(a/b);
    return a/b;
  } 
  catch (Exception e) {
   System.out.println(e);
  }
  finally{
    System.out.println("program executes successfullu");
  }
  return -1;
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
   divide(a, b);
}
}