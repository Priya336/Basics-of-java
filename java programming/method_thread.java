class myt extends Thread{
    public myt (String name){
        super(name);
    }
    public void run(){   
      int i=0;
      while(i<33){
        System.out.println(this.getName());
        i++;
      }
    }
}


public class method_thread{
    public static void main(String[] args) {
        myt t1=new myt("priya1");
        myt t2=new myt("priya2");
        myt t3=new myt("priya3");
        myt t4=new myt("priya4");
        myt t5=new myt("priya5");
        t5.setPriority(Thread.MAX_PRIORITY);
         t2.setPriority(Thread.MIN_PRIORITY);
          t3.setPriority(Thread.MIN_PRIORITY);
       t1.start();
       try {
             t1.join();
       } catch (Exception e) {
        System.out.print(e);
       }
  
       t2.start();
       t3.start();
       t4.start();
       t5.start();
        
    }
}
