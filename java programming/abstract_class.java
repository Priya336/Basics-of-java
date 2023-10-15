abstract class A{
    public void hello(){
        System.out.println("Hello Everyone");
    }
    abstract void greet();
    abstract void greet1();
}
class B extends A{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
     public void greet1(){
        System.out.println("Good Aftternoon");
    }
}
 abstract class C extends A{
    public void t(){
        System.out.println("Good Morning");
    }
    
}

public class abstract_class {
    public static void main(String[] args) {
     //   A obj=new A(); --Not allwed as A is a abstrct class
          B obj=new B();
          obj.greet();
        //   C obj =new C();  --not allowed
    }
}
