import java.util.Scanner;

public class K3SumFunct1 {
    public static void main(String[] args) {
       // sum();
        greeting();
        //sum();
         int ans = sum2();
         System.out.println(ans);
    }  

    static int sum2(){
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int sum = n1+n2;
        return sum;

       // System.out.println("never executed");
    }




        
    //    static void sum(){
    //         Scanner in = new Scanner(System.in);
    //         int n1,n2,sum;
    //         n1 = in.nextInt();
    //         n2 = in.nextInt();
    //         sum = n1 + n2;
    //         System.out.println(sum);
    //     }
        static void greeting(){
            System.out.println("hello world");
        }
    
    
}
