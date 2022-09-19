import java.util.Scanner;
public class K1string {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //  String  name = input.nextLine();
    // input.close();
    //  System.out.println(name);
    //  float marks = input.nextFloat();
    //  System.out.println(marks);
   // input.next
    int n1 = input.nextInt(); // if i give a float value to n1 . n2 then it show error 
    int n2 = input.nextInt();
    int sum = n1 + n2;
    System.out.println(sum); // automatic type convetsion b/c float is grater that integer

    float m1 = input.nextInt();
    float m2 = input.nextInt(); // here no error giving the input value as integer inact it's demand is float.
    float sum1 = m1 + m2;
    System.out.println(sum1);


    } 
}
