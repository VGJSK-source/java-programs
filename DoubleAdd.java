import java.util.Scanner;
//import java.util.scanner;
public class DoubleAdd {
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n =1; int sum = 0;
    while(n<=5){
        int a = scn.nextInt();
        sum += a;
    
    System.out.println( "sum of" + n +"number"+"="+ sum) ;
    n++;
    
        }

        double a1,a2,a3,a4,a5 ,sum1 = 0.0,s1,s2,s3,s4,s5;
         //= a1.nextDouble();
         a1 = scn.nextDouble();
         a2 = scn.nextDouble();
         a3 = scn.nextDouble();
         a4 = scn.nextDouble();
         a5 = scn.nextDouble();
         s1= a1+sum1;
         s2= s1+a2;
         s3= s2+a3;
         s4= s3+a4;
         s5= s4+a5;
         System.out.println(s1);
         System.out.println(s2);
         System.out.println(s3);
         System.out.println(s4);
         System.out.println(s5);
         










        scn.close();
    }
    
}
