import java.util.Arrays;
import java.util.Scanner;

public class K4Arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       int[] arr = new int[5];
       String[] str = new String[n];
       System.out.println("enter integer element");
        for(int i =0; i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("enter string");
        for(int j =0; j<n;j++){
            str[j] = in.next();
        }

        // for(int i =0;i<arr.length;i++){
        //     System.out.print(arr[i] + " ");
        // }
        //......another method to print
        // for(int num: arr){
        //     System.out.println(num+" ");
        // }
        ///........naother method to print
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(str));
    }
    
}
