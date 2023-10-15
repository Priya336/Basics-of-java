
import java.util.HashMap;
import java.util.Map;
/**
 * hashmap
 */
public class hashmap {

    public static void main(String[] args) {
        HashMap<Integer,String>h=new HashMap<>();
        h.put(1,"priya");
        h.put(2,"ritu");
        h.put(3,"golu");
        h.put(4,"harsh");
        h.put(5,"abhi");

        for(Map.Entry<Integer,String>e: h.entrySet()){
            System.out.println("key="+e.getKey() + " value="+e.getValue());
        }
    }
}