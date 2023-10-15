import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        int a=999;
        int b=0;
        int[] a1=new int[3];
        a1[0]=1;
        a1[1]=2;
        a1[2]=3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index");
        int p=sc.nextInt();
        try {
            System.out.println(a1[p]);
            int c=a/b;
        } 
        catch (ArrayIndexOutOfBoundsException e) {
              System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println(e);
        }
        catch(ArithmeticException e){
             System.out.println("We find the exception");
            System.out.println(e);
        }
        catch(Exception e){
         System.out.println(e);
        }
}

}
