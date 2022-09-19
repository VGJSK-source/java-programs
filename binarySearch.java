import java.util.Scanner;

public class binarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first element a is:");
        int a = sc.nextInt();
        System.out.println("Enter the second element b is :");
        int b = sc.nextInt();
        System.out.println("Enter the third element c is:");
        int c = sc.nextInt();

        String str = sc.next();

        sc.close();
        int d = (a+b+c)%3;

        System.out.println("the input string is :"+ str);
        System.out.println("the average of all element is :"+d);

        //447666664727
        //861339190416  DJUPG4231H
        
        
    }
}