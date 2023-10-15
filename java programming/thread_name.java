class mythread extends Thread{
public mythread(String name){
 super(name);
}

public void run(){
    System.out.println("running");
}
}

public class thread_name {
    public static void main(String[] args) {
         mythread t =new mythread("priya");
   t.start();
   System.out.println(t.getName());
    }
   
}
