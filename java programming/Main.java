import java.util.Scanner;

/**
 * main
 */
public class Main {

    public static void main(String[] args) {
        int a=1;
        float b=2.4f;
        float c=a+b;
        char d='a';
        String s2="priya is good girl";  //class
          String s1= new String("priya is bad girl");
        System.out.println("Hello World");
         System.out.println(c );
            System.out.println(s2);
               System.out.println(s1);
               String s;
               Scanner sc=new Scanner(System.in);
               s=sc.next();
               System.out.println(s);
               String s3=sc.nextLine();
                System.out.println(s3);
    }
}
//class name in java should be same as the file name  class-Main , file_name-Main
//the non premitive data types are all class and there keyword having capital letter in the beginning (String,Integer)
//java is not fully OOP language because of int,char,float datatype used in it