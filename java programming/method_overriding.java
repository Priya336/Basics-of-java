/**
 * method_overriding
 */

 class phone{
     phone(){
        System.out.println("I am a constructor of phone");
    }
    void on(){
        System.out.println("Phone is on");
    }
 }
 class Smartphone extends phone{

    Smartphone(){
        System.out.println("I am a constructor of smartphone");
    }
     void music(){
        System.out.println("SmartphonePhone music is on");
    }
    @Override
     void on(){
        System.out.println("Smartphone is on");
    }
 }
public class method_overriding {
public static void main(String[] args) {
    // phone obj=new phone();
        // Smarphone obj=new Smartphone();
        //   Smartphone obj1= new phone();--not allowed
       
  phone obj1= new Smartphone();
  obj1.on();
 //you can call the  other function of only phone class
 // obj1.music(); --not allowed
}
    
}