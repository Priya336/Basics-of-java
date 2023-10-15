interface camera{
    void work();
}
interface GPS{
   void work1() ;
}
interface mediaplayer{
    void work2();
}
class phone{
    void work3(){System.out.println("I am a Smartphone");
}}
class  Smartphone extends phone implements camera,GPS,mediaplayer{
public void work(){ 
System.out.println("I am a camera :TURN  ON");
}
public void work1(){ 
System.out.println("I am a mediaplayer :TURN  ON");
}
public void work2(){ 
System.out.println("I am a GPS:TURN  ON");
}
}
public class polymorphism {
    public static void main(String[] args) {
        camera cam =new Smartphone();
        cam.work();//now the smartphone is working as camera only no other function can be access only function nside camera can be access
      //  cam.work1()---->NOT ALLOWED
      //cam.work3() --now you cannot even use the method os smartphone
    }
}
