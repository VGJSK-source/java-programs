import java.util.Arrays;

public class K4VarArg {
    public static void main(String[] args) {
        fun(6,8,86,8,4,21);        //takes n no of argument
        fun();// no any argument so print null array []
        multiple(2, 7,"gfg","978","vikas");
        //
    }
    static void fun(int ...v){  // v is implicitly declared  array of type of int
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v){// nariable of any length argument will come atlast b/c dont know ho many times it will be come
     // here we can not change order or skip an value of integer or string
    }
}
