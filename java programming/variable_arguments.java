/**
 * variable_arguments
 */

public class variable_arguments {
static int sum(int ...arr){
    //Available as int []array
int result=0;
for(int i:arr){
    result+=i;
}
return result;
}
    public static void main(String[] args) {
      System.out.println(sum(1,2,3,4,5,6));
       System.out.println(sum(1,2,3,4,5,6,8,9));
        System.out.println(sum(1,2,3,4,5,6,4,5,6));
    }
}