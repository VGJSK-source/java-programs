import java.beans.Expression;
import java.util.Scanner;
public class K1typecasting {
    public static void main(String[] args){
        // Scanner input = new Scanner(System.in);
        // float num = input.nextInt();  // 
        // input.close();
        // System.out.println(num); //typecasting
        // int a = (int)(76.87f); 
        // System.out.println(a);
        // // automatic type promotion in expression  smaller to largersize

        // int c = 257;
        // byte  b = (byte)(c);  // 257%256=1 if less than 256 then  size= 0
        // System.out.println(b);


        // byte a = 40;
        // byte b = 50;      // java automatiacally promotion a*b into int b/c it is beyond this limit of byte
        // byte c = 100;      // even though it is byte..
        // int d = a*b/c;
        // System.out.println(d);


        // byte e = 9;
        // e = e*3;    // here also  this exptression evaluates in integer but integer is not defined
        //            //  e = (int)e*3; so tis will be corret format

        //  int number1 = 'A';

        //  System.out.println(number1);
        //  int num = 'a';
        //  System.out.println(num);

        //  System.out.println("anything  / alll language hindi chinese unique code language can print java");
        
        // java promotion several rule for automatic conversion 
        // 1: all byte short char convert into  integer  ie =a*b if any of operands is double
        // then ehole expression in the double ig in float whole in float if in the long  whole 
        // Expression will be in the long
        System.out.println(8*6.89f);

        byte b = 42;
        char c = 'a';
        int i  = 50000;
        double d = 0.1234;
        short s =  1024;
        float f = 5.67f;
        double result = (f+b)+(i/c)-(d*s);

        // float + int - double = double .... b/c double is large among them
        System.out.println((f+b) + " " +(i/c) +  " " + (d*s));
        System.out.println(result);






        
    }
    
}
