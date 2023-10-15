public class method_in_java {

   int logic(int x,int y){
     int z;
     if(x>y){
      z=x+y;
     }
     else{
        z=y-x;
     }
     return z;
    }
    public static void main(String[] args) {
        int a,b,c;
        a=2;
        b=4;
        method_in_java obj=new method_in_java(); // calling of non static function is done by making object
       c=obj.logic(a,b);
       System.out.print(c);
    }
}
