
 class base {
    int a;

    base() {
        System.out.println("I am a constructor");
    }
     base(int a) {
        System.out.println("I am a constructor a:"+a);
    }

    public void set(int x) {
        a = x;
    }

    public int get() {
        return a;
    }
}

class derived extends base {
    int b;

    derived() {
        System.out.println("i am a derived class constructor");
    }
      derived(int a,int b) {
        super(a); // if we not give the int value to base class then the default constructor will be called
        System.out.println("i am a derived class constructor :b"+ b);
    }
}

public class constructor_in_inheritance {

    public static void main(String[] args) {
        derived obj = new derived();
        derived obj2=new derived(1,2);
    }
}
