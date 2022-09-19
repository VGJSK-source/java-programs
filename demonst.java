import java.util.Scanner;
public class demonst {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        int d = a*b*c/1000;
        System.out.println(d);
        int e =a*b*c;
        int f = e%100;
        System.out.println(f);
        

    /**
     * type casting integer to string(vaiable)...
     * integer.toString... String.valueof(variable)
     */

      int num = 8;
      String str = Integer.toString(num);
      System.out.println("string is " + str);

      /**
       * sting to integer................... Integer.parseInt(varianle)
       */
      String stri = "9";
      int name = Integer.parseInt(stri);
      System.out.println("integer is : "+ name);
      /**
       * Char operation
       */
      // getting a specific char into a string

      String city = "Ghaziabad";
      Character firstChar = city.charAt(0);
      System.out.println("the first character in string :" + firstChar);

      //convert string into array of character.......... toCharArray[]

      String my_name = "vikas";
      char[] ch = my_name.toCharArray();
      for(int i=0; i<ch.length; i++)
      System.out.println(ch[i]);

      //check wheather a special char is a letter
      
      Character cha = 'g';
      Boolean isLetter = Character.isLetter(cha);
      System.out.println(isLetter);

      //check character is uppercase
       
      Character char1 ='U';
      boolean isUppercase = Character.isUpperCase(char1);
      System.out.println(isUppercase);

      //check lowercase

      Character char2 = 'h';
      boolean isLowercase = Character.isLowerCase(char2);
      System.out.println(isLowercase);

      //convert character in uppercase

      Character char3 = 'v';
      Character toUppercase = Character.toUpperCase(char3);
      System.out.println(toUppercase);

      //convert character in lowercase....
      Character char4 = 'A';
      Character toLowercase = Character.toLowerCase(char4);
      System.out.println(toLowercase);

      //comparison of character
      Character char6 = 'g';
      Character char7 = 'z';
      boolean comparison = char6 > char7;
      System.out.println(comparison);

      // codimg demonstration

      System.out.println();

      int h = 5;
      double j = 5.0;
      boolean flag = true;
      System.out.println("h:  is : " + h);
      System.out.println(j);
      System.out.println(flag);

      // string & character
      String place = "city";
      Character letter = 'C';
      String distance = place + 590;
      String order = letter + " ";
      String total = distance + order;
      System.out.println(total);
       
     //math opreator
     System.out.println("x power 4 :" + Math.pow(num, 4));

     // string fullname

     String fullName = "my " + "name " + " is" + " vikas";
     String nameUppercase = fullName.toUpperCase();
     System.out.println(nameUppercase);
     
     //conditional loop

     if(num%2==0)
     System.out.println("num is even");
     else
     System.out.println("num is odd");

     double m = 3.8;
     double n = 4.9;
     double o = 5.9;
     if(m>n && m<o)
     System.out.println(m +"is between "+ o);


     int p = 7;
     while(p<7){
         System.out.println(p);
         p++;
     }
     
     for(int k =0; k<p; k++)
      System.out.println(k);

      System.out.println();

     /*  String q = “mine”; 
      char w = ‘h’; 
      int l = 0; 
      System.out.println(q + w + l); */


    }
}
