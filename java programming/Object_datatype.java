import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Object_datatype
 */
public class Object_datatype {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in); //class of scanner having method to input
    int[] c={1,2,3,4,5};
    int [] d=c;
    System.out.println(c.length);
    System.out.println("Original");
    System.out.println("arr c:"+Arrays.toString(c));
    System.out.println("arr d:"+Arrays.toString(d));
    c[1]=6;
    System.out.println("After");
     System.out.println("arr c:"+Arrays.toString(c));
    System.out.println("arr d:"+Arrays.toString(d));
     System.out.println(c); //address of class array
    //user input arry
    int [] arr=new int[10];

    //loop 
    for(int i=0;i<5;i++){
        if(c[i]==6){
            continue;
        }
       System.out.print(c[i]);
    }
       System.out.println(" ");  //println to move to next line and for same line use print only
    for (int i : c) {   //for each loop
    System.out.print(i);
    }
     
//     int [][] v=new int[4][5];
//     for(int i=0;i<4;i++){
//     for(int j=0;j<5;j++){

// v[i][j]= sc.nextInt(); //input from keybord;
//     }
//     }

    float e;
   e=sc.nextFloat();
   boolean b1;
   b1=sc.hasNextInt();
   System.out.print(b1);
  
}
}

