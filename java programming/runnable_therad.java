class myrunnable1 implements Runnable{
int i=0;

    @Override
    public void run() {

    while(i<500){
        System.out.println("runnablethread1");

            i++;}
            }
    }
   

class myrunnable2 implements Runnable{
int i=0;

    @Override
    public void run() {
    while(i<500){
        System.out.println("runnablethread2");
        
            i++;}
           }
    }
   

public class runnable_therad {
    public static void main(String[] args) {
      myrunnable1  bullet1 =new myrunnable1();
      myrunnable2  bullet2=new myrunnable2();
      Thread gun1 =new Thread(bullet1,"priya");
      Thread gun2 =new Thread(bullet2,"ritu");
      System.out.print(gun1.getName());
      gun2.start();
      gun1.start();
    }
    }

      