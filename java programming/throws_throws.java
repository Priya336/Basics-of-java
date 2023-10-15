import java.util.Scanner;
class NegativeradiusException extends Exception{
        public String toString(){
            return "It is a invalid radius";
        }
       
    }
public class throws_throws {
    
public static  double Area(int r) throws NegativeradiusException {
if(r<0){
    throw new NegativeradiusException();
}
double result=Math.PI*r*r;
    return result;

 }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();
        try {
          System.out.println ( Area(r));
        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
