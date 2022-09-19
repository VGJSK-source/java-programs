import java.util.Arrays;

public class K4OverLoading {
    public static void main(String[] args) {
        fun("vikas");
        fun(76); 
       int ans1 = sum(6, 6);
       int ans2 = sum(8, 8, 8);
       System.out.println(ans1);
       System.out.println(ans2);
       demo(6,3,2,7);
       demo("vikas","sarkari","result","army");
    }
    static void fun(int a){
        System.out.println("first one");
        System.out.println(a);
    }
    static  void fun(String name){
        System.out.println("seocnd one");
        System.out.println(name);
    }

    static int sum(int a, int b){
        return a+b;
    }
    static  int sum(int a,int b, int c){
        return a+b+c;
    }

    static void demo(int ...v){ 
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
