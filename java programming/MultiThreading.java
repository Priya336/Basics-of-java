import java.lang.Thread;
class thread1 extends Thread{
    @Override
public void run(){
    int i=0;
    while(i<5000){
    System.out.println("I am cooking thread");
    System.out.println("I am happy");
i++;
}

}
}
//for sometime cookinf meyhod is run and for sometime chatting method is run  --> concurrency
//but in normal execution cooking method excutes completly and the chtting method is run

class thread2 extends Thread{
     @Override
    public void run(){
        int i=0;
        while(i<5000){
    System.out.println("I am chatting thread");
    System.out.println("I am sad");
i++;}

}
}


public class MultiThreading {
    public static void main(String[] args) {
        thread1 t1=new thread1();
        thread2 t2=new thread2();
        t1.start();
        t2.start();
    }
}
