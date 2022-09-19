import java.util.*;
public class GreatestNo {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("hello");
        System.out.println("Enter the element of array:  ");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("the element of array is :");
        for(int i =0; i<n; i++){
            System.out.println(arr[i]);
        }

         int temp = arr[0];
        for(int i =0; i<n; i++ ){
            if(temp<arr[i]){
               temp = arr[i];
            }
        }

        System.out.println("the gratest element is:"+ temp );
        
   }
}

/*
convert into word
import java.util.Scanner;
class Solution {
    String convertToWords(long n) {
        String words ="";
        String unitarray[] ={ "one","two","three","four","five",
        "six","seven","eight","nine", "ten","eleven","twelve",
        "thirteen","fourteen","fifteen","sixteen","eighteen","nineteen"};
      //  String tenarray[] ={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","eighteen","nineteen"};
        String tensarray[] ={"zero","ten","twenty","thirty",
        "fourty","fifty","sixty","seventy","eighty","ninety"};
            if(n==0){
                return 0;
               // System.out.println("zero");
            }
            
            if(n<0) { 
                String number = ""+n;
                number = number.substrigs(1);
                return "minus"+ convertToWords(Integer.parseInt(number));
            }
            if((n/1000000)>0)
            {
              word = word+convertTwoWrds(n/1000000)+"Million";
            n=  n%1000000;
            }
            if((n/1000)>0)
            {
                word = word+convertToWrds(n/1000)+ "Thousands";
            n= n%1000;
        
    }   
            if((n/100)>0)
            {word = word+convertToWrds(n/100)+ "Thousands";
            n= n%100;}
            if(n<0)
            {
                if(n<20){
                    word = word+unitarray[n];
                    
                }
                else {
                    word = word+tensarray[n/10];
                    
                }
                if((n%10)>0)
                word = word+"-"+unitarray[n%10];
            }
            
            return word;
            
            
            
        // code here
        Scanner sc = new Scanner(system.in);
        int number = 0;
        number = sc.nextInt();
        if(number==0)
        System.out.println("the input number is zero:");
        else
        System.out.println("output in words:"+ConvertToWords(n));
    }
} */