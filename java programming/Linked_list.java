import java.util.LinkedList;

public class Linked_list {
    public static void main(String[] args) {
       LinkedList<Integer>l=new LinkedList<>();
       l.add(1);
        l.add(2);
         l.add(3);
        l.add(4);
         l.add(5);
        l.add(2);
           int n=l.size();
           //l.addAll(0,l);
           for(int i=0;i<n;i++){
            System.out.println(l.get(i));
           }
           l.set(1,9);
           l.add(1,21);
           System.out.print(l.indexOf(21));    
        }
    
    
    //same as vector in c++ 
}
