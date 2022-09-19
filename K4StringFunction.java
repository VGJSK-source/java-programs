import java.util.Scanner;

import javax.lang.model.element.Name;

public class K4StringFunction {
    public static void main(String[] args) {
    //     String message = greet();
    //     System.out.println(message);
     Scanner in = new Scanner(System.in);
     String name =in.nextLine();
    String regards = greetings(name) ;
    System.out.println(regards);
    }

    static String greetings(String name){    //passing 1 argument
           String mygreet = "hello"+ name;
           return mygreet;
    }


    // static String greet(){
    //       String greeting = "HOW ARE YOU";



    //     return  greeting;
    //}






}
