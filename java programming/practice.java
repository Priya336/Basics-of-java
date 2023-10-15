import java.util.ArrayList;
import java.util.Scanner;

class libary{
   void add(ArrayList<String>a){
   String s;
   System.out.println("Enter a name of book :");
    Scanner sc =new Scanner(System.in); 
   s=sc.next();
   a.add(s);
   }

     void remove(ArrayList<String>a,ArrayList<String>b){
    String s;
     System.out.println("Enter a name of book :");
    Scanner sc =new Scanner(System.in);
   s=sc.next();
    int p=a.indexOf(s);
     a.remove(p);
     b.add(s);
   }

   void avilable(ArrayList<String>a){
     System.out.println("List of Available books :");
    int s=a.size();
    for(int i=0;i<s;i++){
        System.out.println(a.get(i));
    }
   }
}

public class practice {
    public static void main(String[] args) {
        System.out.println("WELCOME TO PANTNAGAR LIBRARY");
          System.out.println("Enter 1->Adding New book");
           System.out.println("Enter 2->Returing a book");
            System.out.println("Enter 3->List of Available book");
             System.out.println("Enter 4->Exit");
        Scanner sc =new Scanner(System.in); 
      ArrayList<String>issued_book=new ArrayList<String>(50);
       ArrayList<String>Available_book=new ArrayList<String>(50);
       libary obj=new libary();
         int key=3;
       while(key!=4){
     
       System.out.println("Enter a number :");
       int a;
      a=sc.nextInt();
      key=a;
     if(key==1){
        obj.add(Available_book);
     }
     if(key==2){
        obj.remove(Available_book,issued_book);
     }
     if(key==3){
        obj.avilable(Available_book);
     }
       }
    }
}
