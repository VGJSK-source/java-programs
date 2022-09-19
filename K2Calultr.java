import java.util.Scanner;

//import java.util.Scanner;

class K2Calultr{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter the operator");
    char opr = in.next().trim().charAt(0);
    System.out.println("enter the two number");
    int num1 = in.nextInt();
    int num2 = in.nextInt();
    int ans = 0;
    while (true) {
      if (opr == '+' || opr == '-' || opr == '*' || opr == '/' || opr == '%') {
        if (opr == '+') {
          ans = num1 + num2;
        }
        if (opr == '-') {
          ans = num1 - num2;
        }
        if (opr == '*') {
          ans = num1 * num2;
        }
        if (opr == '/') {
          if (num2 != 2)
            ans = num1 / num2;
        }
        if (opr == '%') {
          ans = num1 % num2;
        } else if (opr == 'x' || opr == 'X')
          break;
      } else
        System.out.println("Invalid operator");
      System.out.println(ans);
    }
  }
}