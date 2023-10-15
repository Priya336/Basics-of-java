/**
 * interface
 */
interface comand {
    int c=67;
    void  applybreak(int increment);
    void speedup(int decrement);
}
interface horn{
    int c=67;
    void  hornsrk();
    void hornkk();
}
class bicycle{
void two_wheel(){
    System.out.println("Two wheels");
}
}
class bike extends bicycle   implements comand,horn{  //you can inherit one  class but multiple interfaces can be implemeted
    int speed=5;  
public void applybreak(int a){
   speed=speed-a;
   System.out.println("Apply break");
    }
   public  void speedup(int b){
        speed=speed+b;
        System.out.println("Apply speedup");
     }
     void blow(){
        System.out.println("Horn is blowed:pee pooo pee");
     }
     public void  hornsrk(){
       System.out.println("tuje dikha to ye jana sanam");
     }
    public void hornkk(){
    System.out.println("Natu Natu");
    }
}

public class interfaces {
public static void main(String[] args) {
   bike obj=new bike();
   obj.applybreak(7);
   //obj.c=9;//this is a variable of interface so it cannot be modified
}
    
}