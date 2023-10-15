import java.util.Scanner;

public class practice_exception {
    public static void main(String[] args) {
            int []a1=new int [3];
        a1[0]=1;
        a1[1]=2;
        a1[2]=3;
        Scanner sc=new Scanner(System.in);
        while(true){
        int ind=sc.nextInt();
        try {
         System.out.println(a1[ind]);
         break;   
        } catch (Exception e) {
            System.out.println("Sorry the index is not valid");
        }
        }
        System.out.println("Ending of a program");
    }
}
