class T1 extends Thread{
    int i =0;
   public void run(){
        while(i<100)
         try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Good Morning");
        i++;
    }
}
class T2 extends Thread{
    int i=0;
   
   public void run(){
        while(i<100)
         try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Welcome");
        i++;
    }
}

public class practice_thread {
    public static void main(String[] args) {
        T1 t1=new T1();
        
        T2 t2=new T2();
        t1.start();
        t2.start();
    }
}
