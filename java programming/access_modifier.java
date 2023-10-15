/**
 * access_modifiers
 */
import java.util.*;
 class A1{
    public int a=32;
    protected int b=67;
    int x=9;
    private int c=34;
    public void meth1(){
        System.out.println(a);
         System.out.println(b);
          System.out.println(c);
           System.out.println(x);
    }
}

public class access_modifier{ 
public static void main(String[] args) {
    A1 obj=new A1();
    obj.meth1();
    System.out.print(obj.a);
         System.out.print(obj.b);
         // System.out.print(obj.c); -private have no access in the same package
           System.out.print(obj.x);
}
    
}