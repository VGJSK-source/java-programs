import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

public class k2fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        // int count = 2;
        // // for(count=2; count<=n; count++){
        // //     int sum = b;
        // //     b= b+a;
        // //     a=sum;
        // //     System.out.println(b);
        // // }
        // while(count<=n){
        //     int sum = b;
        //     b = b+a;
        //     a = sum;
        //    // System.out.println(b);
        //    count++;
        // }
        // System.out.println("total of series");
        // System.out.println(b);
        for(int i=0;i<n;i++){
            System.out.println(a);
            int sum = a+b;
            a =b;
            b=sum;
           // System.out.println(b);


    
        }
        //System.out.println(a);
    }
    
}
