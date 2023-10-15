class myth extends Thread{
    public myth (String name){
        super(name);
    }
    public void run(){
        // while(true){
System.out.println("i am a thread  "+this.getName());
    // }
}
}

public class priorities_in_threads {
    public static void main(String[] args) {
        myth t1=new myth("priya1");
        myth t2=new myth("priya2");
        myth t3=new myth("priya3");
        myth t4=new myth("priya4");
        myth t5=new myth("priya5");
         System.out.println(Thread.currentThread().getName());
         t4.setPriority(6);
        t5.setPriority(Thread.MAX_PRIORITY);
         t2.setPriority(Thread.MIN_PRIORITY);
          t3.setPriority(Thread.MIN_PRIORITY);
       t1.start();
       t2.start();
       t3.start();
       t4.start();
       t5.start();
   
        
    }
}
