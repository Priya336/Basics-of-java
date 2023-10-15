interface parent{
    void m1();
}

interface child extends parent{
    void m2();
}

class child2 implements child{
  public void m1(){
System.out.println("Parent interface");
   } 
   public void m2(){
System.out.println("child interface");
   }
}
public class inheritance_of_interfaces {
    public static void main(String[] args) {
        child2 obj=new child2();
        obj.m1();
        obj.m2();
    }
}
