import java.util.Scanner;

public class nested_exception {
    public static void main(String[] args) {
        int []a1=new int [3];
        a1[0]=1;
        a1[1]=2;
        a1[2]=3;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ind=sc.nextInt();
        
        try {
            try {
                int c=a/b;
            } catch (Exception e) {
                System.out.println(e);
            }
             System.out.println(a1[ind]);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
